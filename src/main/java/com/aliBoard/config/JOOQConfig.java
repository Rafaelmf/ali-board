package com.aliBoard.config;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

public class JOOQConfig {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver("org.postgresql.Driver")
                        .withUrl("jdbc:postgresql://localhost:5432/postgres")
                        .withUser("postgres")
                        .withPassword("password"))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.postgres.PostgresDatabase")
                                .withIncludes(".*")
                                .withExcludes("flyway_schema_history")
                                .withInputSchema("public")
                        )
                        .withTarget(new Target()
                                .withPackageName("com.aliBoard.jooq")
                                .withDirectory("src/main/java")));
        GenerationTool.generate(configuration);
    }
}
