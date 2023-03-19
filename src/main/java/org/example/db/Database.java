package org.example.db;


import org.example.dto.Employee;
import org.example.enums.GeneralStatus;
import org.example.enums.ProfileRole;
import org.example.repository.ProfileRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Database {
    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Hotel", "postgres",
                    "root");
            return con;
        } catch (SQLException e) {
            System.out.println(e.getSQLState());
            e.printStackTrace();
            System.exit(-1);
        }
        return null;

    }

    public static void adminInit() {
        Employee profile = new Employee("Ruzi", "Xolmuminov", "123", "123",
                LocalDateTime.now(), GeneralStatus.ACTIVE.toString(), ProfileRole.ADMIN.toString());

        ProfileRepository profileRepository = new ProfileRepository();

        Employee profile2 = profileRepository.searchByPhone(profile.getPhone());
        if (profile2 != null) {
            return;
        }

        profileRepository.addProfileToDb(profile);


    }
}
