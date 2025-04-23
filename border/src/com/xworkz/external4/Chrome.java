package com.xworkz.external4;

import com.xworkz.internal.rules4.Browser;

public class Chrome implements Browser {
    public void openTab() { System.out.println("New tab opened"); }
    public void closeTab() { System.out.println("Tab closed"); }
    public void refreshPage() { System.out.println("Page refreshed"); }
    public void goToURL() { System.out.println("Navigated to URL"); }
    public void bookmarkPage() { System.out.println("Page bookmarked"); }
    public void openHistory() { System.out.println("History opened"); }
    public void downloadFile() { System.out.println("File downloaded"); }
    public void printPage() { System.out.println("Printing page"); }
    public void incognitoMode() { System.out.println("Incognito mode enabled"); }
}
