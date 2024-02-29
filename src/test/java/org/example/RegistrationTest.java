package org.example;


import org.example.data.RegistrationData;
import org.example.data.RegistrationModel;
import org.example.pages.RegistrationPage;
import org.example.pages.components.ModalWindowComponent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class RegistrationTest extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
    ModalWindowComponent modalWindowComponent = new ModalWindowComponent();

    @BeforeEach
    public void beforeEach() {
        registrationPage.openPage();
    }

    @Test
    void successfulRegisterFullDataTest() {
        RegistrationModel registrationFullData = RegistrationData.generateFullRegistrationData();

        registrationPage.fillAllStudentFields(registrationFullData);
        registrationPage.submit();

        modalWindowComponent.checkAllStudentFields(registrationFullData);
    }

    @Test
    void successfulRegisterMinDataTest() {
        RegistrationModel registrationFullData = RegistrationData.generateMinimumRegistrationData();


        registrationPage.fillMinStudentFields(registrationFullData);
        registrationPage.submit();

        modalWindowComponent.checkMinStudentFields(registrationFullData);
    }
}