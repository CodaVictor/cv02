package cz.upce.fei.cv02.controller;

import cz.upce.fei.cv02.domain.AppUser;
import cz.upce.fei.cv02.repository.AppUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/appUser")
public class UserController {
    private final AppUserRepository appUserRepository;

    public UserController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @GetMapping("")
    public List<AppUser> findAll() {
        return appUserRepository.findAllByActiveEquals(true);
    }
}
