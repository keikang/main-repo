package com.bitnine.mainrepo.api;

import com.bitnine.secrerepolib1.service.SecretRepoLib1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/main-repo")
public class MainRepoController {

    @GetMapping("/")
    public ResponseEntity<?> secretRepoSource1() {
        return ResponseEntity.ok("나는 main-repo repository에 있습니다.");
    }

/*    @GetMapping("/libs")
    public ResponseEntity<?> secretRepoSource1Libs() {
        return ResponseEntity.ok(secretRepoLib1Service.getStringMessage());
    }*/

}
