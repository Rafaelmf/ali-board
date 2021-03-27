package com.aliBoard.dao;

import com.aliBoard.jooq.enums.ProfileStatus;
import com.aliBoard.models.UserProfile;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.aliBoard.jooq.tables.UserProfile.USER_PROFILE;

@Repository
public class UserDAO {

    @Autowired
    DSLContext dslContext;

    public List<UserProfile> fetchAllByStatus(String status) {
        return dslContext.select().from(USER_PROFILE).where(USER_PROFILE.STATUS.eq(ProfileStatus.valueOf(status))).fetchInto(UserProfile.class);
    }

    public int updateUserStatusByEmail(String email, String newStatus) {
        return dslContext.update(USER_PROFILE).set(USER_PROFILE.STATUS, ProfileStatus.valueOf(newStatus)).where(USER_PROFILE.EMAIL.eq(email)).execute();
    }

}
