package org.example.service;

import org.example.controller.Admin.AdminController;
import org.example.dto.Employee;
import org.example.enums.GeneralStatus;
import org.example.enums.ProfileRole;
import org.example.repository.ProfileRepository;

public class EmployeeService {

    private ProfileRepository profileRepository;

    public EmployeeService() {
        this.profileRepository = new ProfileRepository();
    }

    public void login(String phone, String password) {
        Employee profile = profileRepository.searchByPhone(phone);

        if (profile == null) {
            System.out.println("Phone xato!");
            return;
        }

        if (!profile.getPsw().equals(password)) {
            System.out.println("Parol xato");
            return;
        }

        if (profile.getStatus().equals(GeneralStatus.BLOCK.toString())) {
            System.out.println("Bu login blocklangan");
            return;
        }

        if (profile.getType().equals(ProfileRole.ADMIN.toString())) {
            AdminController adminController = new AdminController();
            adminController.start();

        }else {
            System.err.println("Mazgi sen Admin emassan.");
            return;
        }
    }

}
