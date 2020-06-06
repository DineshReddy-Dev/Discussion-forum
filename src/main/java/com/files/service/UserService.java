package com.files.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.files.persistence.model.User;
import com.files.web.dto.UserRegistrationDto;
import com.files.web.dto.UserSettingsDto;

public interface UserService {

	int save(User user);

	User findById(Long id);

	User findByUsername(String username);

	User findByEmail(String email);

	User findAuthenticatedUser();

	Map<String, Object> getUserProfileAndPostsByUserIdByTabType(Long userId, String tabType);

	Map<String, Object> updateUserProfile(UserSettingsDto newUserSettingsForm);

	Map<String, Object> getUserSettingPage();

	Map<String, Object> registerUserAccount(UserRegistrationDto userDto, HttpServletRequest request);

	Map<String, Object> confirmUserRegistrationWithToken(String token);

}
