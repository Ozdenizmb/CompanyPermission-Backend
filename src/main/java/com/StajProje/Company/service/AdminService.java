package com.StajProje.Company.service;

import com.StajProje.Company.dto.AdminCreateDto;
import com.StajProje.Company.dto.AdminDto;
import com.StajProje.Company.dto.AdminUpdateDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public interface AdminService {

    AdminDto signUpAdmin(String key, AdminCreateDto adminCreateDto);
    AdminDto loginAdmin(String key, String email, String password);
    AdminDto getAdmin(String email);
    Page<AdminDto> getAdmins(Pageable pageable);
    AdminDto updateAdmin(String key, UUID id, AdminUpdateDto adminUpdateDto, MultipartFile file);
    Boolean deleteAdmin(String key, UUID id);

}
