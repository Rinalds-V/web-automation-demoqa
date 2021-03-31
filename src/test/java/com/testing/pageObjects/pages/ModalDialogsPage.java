package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/modal-dialogs")
public class ModalDialogsPage extends AlertsFrameAndWindowsPage {
    // Locators ----------------------------------------------------------------------------------------------------------
    public static By MODAL_DIALOGS_TITLE = text("Modal Dialogs");
    public static By SMALL_MODAL_BUTTON = css("button[id='showSmallModal']");
    public static By LARGE_MODAL_BUTTON= css("button[id='showLargeModal']");
    public static By CLOSE_MODAL_BUTTON= css("button[id='closeSmallModal']");
    public static By LARGE_CLOSE_MODAL_BUTTON= css("button[class='close']");
    // Public methods ----------------------------------------------------------------------------------------------------
    public void waitForPageToLoad() {
        getElement(MODAL_DIALOGS_TITLE).waitUntilPresent();
        logWeAreOnPage();
    }
}
