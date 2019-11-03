package com.hackerrank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() throws InterruptedException {

        driver.get("https://www.hackerrank.com/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("HackerRank"));

    }

}


/*
started by timer

Obtained Jenkins-smoke from git https://github.com/HDPlus/mics-automation-tests
Running in Durability level: MAX_SURVIVABILITY
[Pipeline] Start of Pipeline
[Pipeline] properties
[Pipeline] node
Running on Jenkins in /var/lib/jenkins/workspace/Automation-Tests-SMOKE
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Checkout SCM)
[Pipeline] checkout
using credential 019ceafd-b088-440c-aea7-82c47a373555
Cloning the remote Git repository
Cloning repository https://github.com/HDPlus/mics-automation-tests
 > git init /var/lib/jenkins/workspace/Automation-Tests-SMOKE # timeout=10
Fetching upstream changes from https://github.com/HDPlus/mics-automation-tests
 > git --version # timeout=10
using GIT_ASKPASS to set credentials jenkins-github integration
 > git fetch --tags --progress https://github.com/HDPlus/mics-automation-tests +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git config remote.origin.url https://github.com/HDPlus/mics-automation-tests # timeout=10
 > git config --add remote.origin.fetch +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git config remote.origin.url https://github.com/HDPlus/mics-automation-tests # timeout=10
Fetching upstream changes from https://github.com/HDPlus/mics-automation-tests
using GIT_ASKPASS to set credentials jenkins-github integration
 > git fetch --tags --progress https://github.com/HDPlus/mics-automation-tests +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/master^{commit} # timeout=10
 > git rev-parse refs/remotes/origin/origin/master^{commit} # timeout=10
Checking out Revision 5d3406eb29776756533b7513f0494a6e7ad8b20e (refs/remotes/origin/master)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 5d3406eb29776756533b7513f0494a6e7ad8b20e # timeout=10
Commit message: "fix Check base elements test"
 > git rev-list --no-walk 5d3406eb29776756533b7513f0494a6e7ad8b20e # timeout=10
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
[Pipeline] withCredentials
Masking only exact matches of $OTA_CREDENTIALS or $OTA_CREDENTIALS_USR or $OTA_CREDENTIALS_PSW or $THUB_CREDENTIALS or $THUB_CREDENTIALS_USR or $THUB_CREDENTIALS_PSW or $TDASH_CREDENTIALS or $TDASH_CREDENTIALS_USR or $TDASH_CREDENTIALS_PSW
[Pipeline] {
[Pipeline] withEnv
[Pipeline] {
[Pipeline] stage
[Pipeline] { (UI SMOKE TEST)
[Pipeline] script
[Pipeline] {
[Pipeline] git
using credential 8897a098-a056-4ac0-a67b-a8c263c3ea9f
 > git rev-parse --is-inside-work-tree # timeout=10
Fetching changes from the remote Git repository
 > git config remote.origin.url https://github.com/HDPlus/mics-automation-tests/ # timeout=10
Fetching upstream changes from https://github.com/HDPlus/mics-automation-tests/
 > git --version # timeout=10
using GIT_ASKPASS to set credentials
 > git fetch --tags --progress https://github.com/HDPlus/mics-automation-tests/ +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git rev-parse refs/remotes/origin/master^{commit} # timeout=10
 > git rev-parse refs/remotes/origin/origin/master^{commit} # timeout=10
Checking out Revision 5d3406eb29776756533b7513f0494a6e7ad8b20e (refs/remotes/origin/master)
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 5d3406eb29776756533b7513f0494a6e7ad8b20e # timeout=10
 > git branch -a -v --no-abbrev # timeout=10
 > git checkout -b master 5d3406eb29776756533b7513f0494a6e7ad8b20e # timeout=10
Commit message: "fix Check base elements test"
[Pipeline] sh
+ ./gradlew clean smokeTest -Dtablohub.user=**** -Dtablohub.password=**** -Dtablodash.user=**** -Dtablodash.password=**** -Dota.apiUrl=http://ota-stage-internal.tablodash.com:8088 -Dota.user=**** -Dota.password=**** -Dtablohub.uiUrl=https://tablohub.com -Dtablohub.apiAuthUrl=https://tablohub.com -Dtablohub.apiBaseUrl=http://treatment-01.tablodash.com -Dtablohub.apiAccessUrl=https://auth.tablodash.com -Dtablodash.uiUrl=https://tablodash.com -Dtablodash.apiAuthUrl=https://tablodash.com
Starting a Gradle Daemon, 3 busy Daemons could not be reused, use --status for details
> Task :clean UP-TO-DATE

> Task :compileJava
Note: /var/lib/jenkins/workspace/Automation-Tests-SMOKE/src/main/java/core/ApiClient.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

> Task :processResources
> Task :classes

> Task :compileTestJava
Note: /var/lib/jenkins/workspace/Automation-Tests-SMOKE/src/test/java/com/tablohub/Kafka/KafkaTest.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: /var/lib/jenkins/workspace/Automation-Tests-SMOKE/src/test/java/com/tablohub/Kafka/KafkaGetMess.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

> Task :processTestResources
> Task :testClasses

> Task :smokeTest

Gradle Test Executor 1 STANDARD_ERROR
    Nov 02, 2019 5:00:26 PM org.junit.platform.launcher.core.LauncherConfigurationParameters fromClasspathResource
    INFO: Loading JUnit Platform configuration parameters from classpath resource [file:/var/lib/jenkins/workspace/Automation-Tests-SMOKE/build/resources/test/junit-platform.properties].

Gradle Test Executor 2 STANDARD_ERROR
    Nov 02, 2019 5:00:26 PM org.junit.platform.launcher.core.LauncherConfigurationParameters fromClasspathResource
    INFO: Loading JUnit Platform configuration parameters from classpath resource [file:/var/lib/jenkins/workspace/Automation-Tests-SMOKE/build/resources/test/junit-platform.properties].
    Nov 02, 2019 5:00:27 PM org.junit.jupiter.engine.config.EnumConfigurationParameterConverter get
    INFO: Using test instance lifecycle mode 'PER_CLASS' set via the 'junit.jupiter.testinstance.lifecycle.default' configuration parameter.

Gradle Test Executor 1 STANDARD_ERROR
    Nov 02, 2019 5:00:27 PM org.junit.jupiter.engine.config.EnumConfigurationParameterConverter get
    INFO: Using test instance lifecycle mode 'PER_CLASS' set via the 'junit.jupiter.testinstance.lifecycle.default' configuration parameter.
[AppClassLoader@42a57993] warning javax.* types are not being woven because the weaver option '-Xset:weaveJavaxPackages=true' has not been specified
    Nov 02, 2019 5:00:28 PM org.junit.jupiter.engine.config.EnumConfigurationParameterConverter get
    INFO: Using parallel execution mode 'CONCURRENT' set via the 'junit.jupiter.execution.parallel.mode.default' configuration parameter.

Gradle Test Executor 2 STANDARD_ERROR
    Nov 02, 2019 5:00:28 PM org.junit.jupiter.engine.config.EnumConfigurationParameterConverter get
    INFO: Using parallel execution mode 'CONCURRENT' set via the 'junit.jupiter.execution.parallel.mode.default' configuration parameter.

com.tablohub.Ui.TreatmentLoginTest STANDARD_ERROR
    Nov 02, 2019 5:00:28 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:00:28 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:00:28 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:28 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:28 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running
    Nov 02, 2019 5:00:28 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.TreatmentDownloadTest STANDARD_ERROR
    Nov 02, 2019 5:00:28 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running

com.tablohub.Ui.TreatmentLoginTest > openLoginPage() STANDARD_ERROR
    Nov 02, 2019 5:00:29 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver
    Nov 02, 2019 5:00:29 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver

com.tablohub.Ui.TreatmentDownloadTest STANDARD_ERROR
    Nov 02, 2019 5:00:29 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:29 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.TreatmentDownloadTest > checkDownloadTreatment() STANDARD_ERROR
    Nov 02, 2019 5:00:29 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver
    Nov 02, 2019 5:00:31 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:00:31 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:31 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[1] STANDARD_ERROR
    Nov 02, 2019 5:00:31 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver

com.tablohub.Ui.TreatmentLoginTest > openLoginPage() STANDARD_ERROR
    Nov 02, 2019 5:00:35 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:00:36 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:00:36 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:00:36 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (b02003a8411c60592b07e071f5c2b936)

com.tablohub.Ui.TreatmentLoginTest > openLoginPage() STANDARD_OUT


     Cookies is: [ ]

com.tablohub.Ui.TreatmentLoginTest > openLoginPage() STANDARD_ERROR
    Nov 02, 2019 5:00:41 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C

com.tablohub.Ui.TreatmentLoginTest > openLoginPage() PASSED

com.tablohub.Ui.TreatmentLoginTest STANDARD_ERROR
    Nov 02, 2019 5:00:41 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:00:41 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (b02003a8411c60592b07e071f5c2b936)
    Nov 02, 2019 5:00:41 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:00:41 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 85 ms
    Nov 02, 2019 5:00:41 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:41 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.TreatmentFilter STANDARD_ERROR
    Nov 02, 2019 5:00:41 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:00:41 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:41 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.TreatmentFilter > checkDownloadTreatmentListFields() STANDARD_ERROR
    Nov 02, 2019 5:00:41 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver
    Nov 02, 2019 5:00:41 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:00:41 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:00:41 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (75717e4a78260a21151835bf60d8b41e)

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[1] STANDARD_ERROR
    Nov 02, 2019 5:00:47 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:00:47 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:00:47 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:00:47 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (fb3c267cbeb1253c9818047b80e11b82)
    Nov 02, 2019 5:00:50 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:00:50 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:00:50 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:00:50 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (6965909f2a652d61059cf95765eff1c0)

com.tablohub.Ui.TreatmentFilter > checkDownloadTreatmentListFields() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.SupportPageTest > checkHeatmapReport() PASSED

com.tablodash.Ui.SupportPageTest STANDARD_ERROR
    Nov 02, 2019 5:00:55 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:00:55 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (75717e4a78260a21151835bf60d8b41e)
    Nov 02, 2019 5:00:55 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:00:55 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 69 ms
    Nov 02, 2019 5:00:55 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:55 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.CurrentStatusDashboard STANDARD_ERROR
    Nov 02, 2019 5:00:55 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:00:55 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:00:55 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.CurrentStatusDashboard > checkCurrentStatusDashboardPage() STANDARD_ERROR
    Nov 02, 2019 5:00:55 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[1] STANDARD_OUT
    Serial Numbers list appeared
    treatments list more than 1 [8] elements
    treatments choose 8


     Cookies is: [ ]

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[1] PASSED

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[2] STANDARD_OUT
    Filename: <pre>
    <a href="400126-40012600600.pdf">400126-40012600600.pdf</a>
    </pre>

    DOC: <html>
     <head></head>
     <body>
      <pre><a href="400126-40012600600.pdf">400126-40012600600.pdf</a>
    </pre>
     </body>
    </html>
    Link to download file: http://qa-01.tablodash.com:4444/download/fb3c267cbeb1253c9818047b80e11b82/400126-40012600600.pdf
    build/tmp/2019-11-02-17-01-09yAWHM.pdf
    ORIGIN FILE NAME: 400126-40012600600.pdf
    PATH TO FILE: build/tmp/2019-11-02-17-01-09yAWHM.pdf
    Is FILE READABLE: true

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[2] STANDARD_ERROR
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Times-Roman
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Times-Bold
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Times-Italic
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Times-BoldItalic
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Helvetica
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Helvetica-Bold
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Helvetica-Oblique
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Helvetica-BoldOblique
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Courier
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Courier-Bold
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Courier-Oblique
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Courier-BoldOblique
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font Symbol
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for base font ZapfDingbats
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica
    Nov 02, 2019 5:01:09 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica-Bold

com.tablodash.Ui.CurrentStatusDashboard > checkCurrentStatusDashboardPage() STANDARD_ERROR
    Nov 02, 2019 5:01:09 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[2] STANDARD_OUT
    Site Name: HDSF
    Nephrologist: Dr. G Voinescu
    Gender: Male
    Height: 185 cm
    Dialysis Status: ESRD
    Patient Name: Robert Aguilar
    MRN #: AR4533
    DOB: 4/15/1931
    Treatment Date: Thu 9/12/2019 (America/Denver)
    Treatment Time Completed: 7 min
    Tablo Serial Number: 400126
    Access Information
    Access Type: Temp Catheter
    Prescription Information
    EDW: 77 kg
    Treatment Time: 4 hrs 0 min
    BFR: 250 mL/min
    DFR: 200 mL/min
    Dialyzer: Optiflux F180NR
    Dialysis Fluid Potassium: 3 mEq/L
    Dialysis Fluid Calcium: 2.5 mEq/L
    Other Orders:
    Total Buffer Setting: 37 mEq/L
    Sodium Setting: 140 mEq/L
    Dialysate Temp: 36.8 °C
    Initial Heparin Bolus: 4000
    Machine Verifications
    Tablo Conductivity Actual: 13.8 ms/cm
    Tablo Dialysis Fluid Temp: 36.8 °C
    RO Rejection Actual: 98.3 %
    Source of Water: Tap
    Treatment Information
    UF Goal: 200 mL
    Total Fluid Removed: -286.2 mL
    Liters Processed: 1.66 L
    Weight change from Today: -2.8 kg
    Weight change from EDW: -3.0 kg
    Total NSS Bolus Volume: 0.0 ml
    Pre-Treatment
    BP Sitting:
    BP Standing:
    HR: 0
    Temperature: 35.5 °C
    Weight: 77.2 kg
    Treatment Start Time: 16:37
    Post-Treatment
    BP Sitting:
    BP Standing:
    HR: 0
    Temperature: 37.0 °C
    Weight: 80.0 kg
    Treatment End Time: 16:51
    Care Giver:
    Nurse Nurse Nurse
    Page 1 of 2
    Patient Name: Robert Aguilar
    MRN #: AR4533
    DOB: 4/15/1931
    Treatment Date: Thu 9/12/2019 (America/Denver)
    Treatment Time Completed: 7 min
    Site Name: HDSF
    Nephrologist: Dr. G Voinescu
    Gender: Male
    Height: 185 cm
    Dialysis Status: ESRD
    Tablo Serial Number: 400126
    INTRADIALYTICS
    Time BP HR BFR
    mL/min
    DFR
    mL/min
    VP
    mmHg
    AP
    mmHg
    NSS
    mL
    UFR
    mL/hr
    Volume
    Removed
    Conc.
    Type
    Tx
    Length
    TMP
    mmHg
    Care Giver:
    Nurse Nurse Nurse
    Page 2 of 2

com.tablodash.Ui.CurrentStatusDashboard > checkCurrentStatusDashboardPage() STANDARD_ERROR
    Nov 02, 2019 5:01:10 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:01:10 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:01:10 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (0037a4cc24a86fb366a3843578a27b30)

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[2] STANDARD_OUT


     Cookies is: [ ]

com.tablohub.Ui.TreatmentDownloadTest > checkDownloadTreatment() PASSED

com.tablohub.Ui.TreatmentDownloadTest STANDARD_ERROR
    Nov 02, 2019 5:01:17 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:01:17 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (fb3c267cbeb1253c9818047b80e11b82)
    Nov 02, 2019 5:01:17 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:01:17 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 119 ms
    Nov 02, 2019 5:01:17 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:01:17 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.DisinfectReportCommentTest STANDARD_ERROR
    Nov 02, 2019 5:01:17 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:01:17 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:01:17 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.DisinfectReportCommentTest > disinfectDownloadTest() STANDARD_ERROR
    Nov 02, 2019 5:01:17 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver

com.tablodash.Ui.CurrentStatusDashboard > checkCurrentStatusDashboardPage() STANDARD_ERROR
    Nov 02, 2019 5:01:26 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:01:26 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:01:26 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:01:26 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (66176c27d015361eeac715aef14b7c37)

com.tablohub.Ui.DisinfectReportCommentTest > disinfectDownloadTest() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[2] PASSED

com.tablodash.Ui.CurrentStatusDashboard > checkCurrentStatusDashboardPage() STANDARD_OUT


     Cookies is: [ ]

com.tablohub.Ui.TreatmentFilter > checkDownloadTreatmentListFields() PASSED

com.tablohub.Ui.TreatmentFilter STANDARD_ERROR
    Nov 02, 2019 5:01:33 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:01:33 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (0037a4cc24a86fb366a3843578a27b30)
    Nov 02, 2019 5:01:33 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:01:33 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 136 ms
    Nov 02, 2019 5:01:33 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:01:33 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.Mtbr STANDARD_ERROR
    Nov 02, 2019 5:01:33 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:01:33 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:01:33 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.Mtbr > checkMtbrPage() STANDARD_ERROR
    Nov 02, 2019 5:01:33 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver

com.tablodash.Ui.Mtbr > checkMtbrPage() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.CurrentStatusDashboard > checkCurrentStatusDashboardPage() PASSED

com.tablodash.Ui.CurrentStatusDashboard STANDARD_ERROR
    Nov 02, 2019 5:01:39 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:01:39 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (66176c27d015361eeac715aef14b7c37)
    Nov 02, 2019 5:01:39 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[3] STANDARD_ERROR
    Nov 02, 2019 5:01:39 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C

com.tablodash.Ui.CurrentStatusDashboard STANDARD_ERROR
    Nov 02, 2019 5:01:39 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 130 ms
    Nov 02, 2019 5:01:39 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:01:39 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.ReleaseDashboard STANDARD_ERROR
    Nov 02, 2019 5:01:39 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:01:39 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:01:39 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.ReleaseDashboard > releaseDashboardPresent() STANDARD_ERROR
    Nov 02, 2019 5:01:39 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[3] STANDARD_ERROR
    Nov 02, 2019 5:01:39 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:01:39 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:01:39 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (0440512a420d52e1aa19a64232510e0b)

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[3] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[3] PASSED

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[4] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[4] PASSED

com.tablodash.Ui.ReleaseDashboard > releaseDashboardPresent() STANDARD_ERROR
    Nov 02, 2019 5:02:11 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:02:11 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:02:11 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:02:11 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (e666e2b2102876f7a62ff78144a7b454)

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[5] STANDARD_OUT
    Calendar click-in
    Current month: [November]
    PREV month: [October]
    Calendar current month: ]October]
    Calendar current month: [November]
    Current day chose


     Cookies is: [ ]

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard > realTimeDashboardInputs(String)[5] PASSED

com.tablodash.Ui.RealTimeDashboard.RealTimeDashboard STANDARD_ERROR
    Nov 02, 2019 5:02:28 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:28 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (6965909f2a652d61059cf95765eff1c0)
    Nov 02, 2019 5:02:28 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:02:28 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 121 ms
    Nov 02, 2019 5:02:28 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:28 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.MainPage STANDARD_ERROR
    Nov 02, 2019 5:02:28 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:28 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:28 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_ERROR
    Nov 02, 2019 5:02:28 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver

com.tablodash.Ui.ReleaseDashboard > releaseDashboardPresent() STANDARD_ERROR
    Nov 02, 2019 5:02:33 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:02:33 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:02:33 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:02:33 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (2ed949bdd594725a1f442841c3b28dda)

com.tablodash.Ui.ReleaseDashboard > releaseDashboardPresent() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.Mtbr > checkMtbrPage() PASSED

com.tablodash.Ui.Mtbr STANDARD_ERROR
    Nov 02, 2019 5:02:34 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:34 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (e666e2b2102876f7a62ff78144a7b454)
    Nov 02, 2019 5:02:34 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:02:34 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 128 ms
    Nov 02, 2019 5:02:34 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:34 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.KnowledgeBase STANDARD_ERROR
    Nov 02, 2019 5:02:34 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:34 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:34 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.KnowledgeBase > checkKnowledgeBasePage() STANDARD_ERROR
    Nov 02, 2019 5:02:34 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_OUT
    SERIAL # 400272

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_ERROR
    Nov 02, 2019 5:02:41 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:02:41 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:02:41 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:02:41 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (62cb98025e4d4de9775becf8fcd59cdf)

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_OUT
    File Name: Disinfect_Report_2019-11-02-2019-11-02.pdf
    Link to download file: http://qa-01.tablodash.com:4444/download/0440512a420d52e1aa19a64232510e0b/Disinfect_Report_2019-11-02-2019-11-02.pdf
    PATH TO FILE: build/tmp/Disinfect_Report_2019-11-02-2019-11-02.pdf
    Is FILE READABLE: true

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_ERROR
    Nov 02, 2019 5:02:43 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica-Bold
    Nov 02, 2019 5:02:43 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_OUT
    INTERMOUNTAIN MED CTR DIALYSIS SVCS     NOV 2019     SERIAL # 400272  (AMERICA/DENVER)
    Start date Start time End time Heat Quick Chem Full Chem Residual Test Comment
    02 Nov No activity
    Report generated
    02 Nov 2019 5:02 pm (UTC)
    Disinfect Report
    Nov 2 - Nov 2, 2019 1 of 1
    Reviewed by: Page 1 of 1
    File Name: Disinfect_Report_2019-11-02-2019-11-02.pdf
    Link to download file: http://qa-01.tablodash.com:4444/download/0440512a420d52e1aa19a64232510e0b/Disinfect_Report_2019-11-02-2019-11-02.pdf
    All ok =>[SERIAL # 400272]
    PATH TO FILE: build/tmp/Disinfect_Report_2019-11-02-2019-11-02.pdf
    Is FILE READABLE: true

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_ERROR
    Nov 02, 2019 5:02:43 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica-Bold
    Nov 02, 2019 5:02:43 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_OUT
    INTERMOUNTAIN MED CTR DIALYSIS SVCS     NOV 2019     SERIAL # 400272  (AMERICA/DENVER)
    Start date Start time End time Heat Quick Chem Full Chem Residual Test Comment
    02 Nov No activity
    Report generated
    02 Nov 2019 5:02 pm (UTC)
    Disinfect Report
    Nov 2 - Nov 2, 2019 1 of 1
    Reviewed by: Page 1 of 1
    PATH TO FILE: build/tmp/Disinfect_Report_2019-11-02-2019-11-02.pdf
    Is FILE READABLE: true

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_ERROR
    Nov 02, 2019 5:02:43 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica-Bold
    Nov 02, 2019 5:02:43 PM org.apache.pdfbox.pdmodel.font.PDType1Font <init>
    WARNING: Using fallback font LiberationSans for Helvetica

com.tablodash.Ui.MainPage > enterToTabloDash() STANDARD_OUT
    PDF downloaded and filtered success: [INTERMOUNTAIN MED CTR DIALYSIS SVCS     NOV 2019     SERIAL # 400272  (AMERICA/DENVER)]


     Cookies is: [ ]

com.tablohub.Ui.DisinfectReportCommentTest > disinfectDownloadTest() PASSED

com.tablohub.Ui.DisinfectReportCommentTest STANDARD_ERROR
    Nov 02, 2019 5:02:44 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:44 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (0440512a420d52e1aa19a64232510e0b)
    Nov 02, 2019 5:02:44 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:02:44 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 141 ms
    Nov 02, 2019 5:02:44 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:44 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.DisinfectReportsPageTest STANDARD_ERROR
    Nov 02, 2019 5:02:44 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:44 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:44 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablohub.Ui.DisinfectReportsPageTest > disinfectReportChooseFilterByLocation() STANDARD_ERROR
    Nov 02, 2019 5:02:44 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver

com.tablodash.Ui.KnowledgeBase > checkKnowledgeBasePage() STANDARD_OUT
    I'm on releasePerformanceDashboardPagePresent Tablo count by SW version

com.tablodash.Ui.KnowledgeBase > checkKnowledgeBasePage() STANDARD_ERROR
    Nov 02, 2019 5:02:50 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:02:51 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:02:51 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:02:51 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (72da91b909199260de155aad665e43f5)

com.tablodash.Ui.KnowledgeBase > checkKnowledgeBasePage() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.ReleaseDashboard > releaseDashboardPresent() PASSED

com.tablodash.Ui.ReleaseDashboard STANDARD_ERROR
    Nov 02, 2019 5:02:57 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:57 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (2ed949bdd594725a1f442841c3b28dda)
    Nov 02, 2019 5:02:57 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:02:58 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 243 ms
    Nov 02, 2019 5:02:58 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:58 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.Mtbf STANDARD_ERROR
    Nov 02, 2019 5:02:58 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:02:58 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:02:58 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.Mtbf > checkMtbfPage() STANDARD_ERROR
    Nov 02, 2019 5:02:58 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver

com.tablohub.Ui.DisinfectReportsPageTest > disinfectReportChooseFilterByLocation() STANDARD_OUT
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200
    200


     Cookies is: [ ]

com.tablodash.Ui.MainPage > enterToTabloDash() PASSED

com.tablodash.Ui.MainPage STANDARD_ERROR
    Nov 02, 2019 5:03:53 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:03:53 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (62cb98025e4d4de9775becf8fcd59cdf)
    Nov 02, 2019 5:03:53 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:03:54 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 671 ms
    Nov 02, 2019 5:03:54 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:03:54 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.BusinessReview STANDARD_ERROR
    Nov 02, 2019 5:03:54 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:03:54 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:03:54 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[1] STANDARD_ERROR
    Nov 02, 2019 5:03:54 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver
    Nov 02, 2019 5:04:25 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:04:26 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:04:26 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:04:26 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (eb799fc9166c689443c072941ffe64d9)

com.tablodash.Ui.Mtbf > checkMtbfPage() STANDARD_ERROR
    Nov 02, 2019 5:04:32 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C

com.tablodash.Ui.Mtbf > checkMtbfPage() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.Mtbf > checkMtbfPage() STANDARD_ERROR
    Nov 02, 2019 5:04:33 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:04:33 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:04:33 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (ca4c0dd2d23d4fd3b853c951d4151c47)

com.tablodash.Ui.Mtbf > checkMtbfPage() STANDARD_OUT
    org.openqa.selenium.InvalidArgumentException: invalid argument: log type 'performance' not found
      (Session info: chrome=76.0.3809.87)
    Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
    System info: host: 'ip-172-31-50-226', ip: '172.31.50.226', os.name: 'Linux', os.arch: 'amd64', os.version: '4.4.0-1096-aws', java.version: '1.8.0_222'
    Driver info: org.openqa.selenium.remote.RemoteWebDriver
    Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.87, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /tmp/.com.google.Chrome.CB4g2Y}, goog:chromeOptions: {debuggerAddress: localhost:39478}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}
    Session ID: 72da91b909199260de155aad665e43f5

com.tablodash.Ui.KnowledgeBase > checkKnowledgeBasePage() FAILED
    com.codeborne.selenide.ex.ElementNotFound at KnowledgeBase.java:39
        Caused by: org.openqa.selenium.NoSuchElementException at KnowledgeBase.java:39

com.tablodash.Ui.KnowledgeBase STANDARD_ERROR
    Nov 02, 2019 5:04:38 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:04:38 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (72da91b909199260de155aad665e43f5)
    Nov 02, 2019 5:04:38 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:04:39 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 760 ms
    Nov 02, 2019 5:04:39 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:04:39 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.UpTimeDashboard STANDARD_ERROR
    Nov 02, 2019 5:04:39 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:04:39 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:04:39 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.UpTimeDashboard > checkUptimePage() STANDARD_ERROR
    Nov 02, 2019 5:04:39 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[1] STANDARD_ERROR
    Nov 02, 2019 5:05:13 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:05:13 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:05:13 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:05:13 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (9c52b5635fe7011ef5bb0cb8909cddd6)

com.tablodash.Ui.UpTimeDashboard > checkUptimePage() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.Mtbf > checkMtbfPage() PASSED

com.tablodash.Ui.Mtbf STANDARD_ERROR
    Nov 02, 2019 5:05:20 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:05:20 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (ca4c0dd2d23d4fd3b853c951d4151c47)
    Nov 02, 2019 5:05:20 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:05:20 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 134 ms
    Nov 02, 2019 5:05:20 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:05:20 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.FseDashboard STANDARD_ERROR
    Nov 02, 2019 5:05:20 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:05:20 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:05:20 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.FseDashboard > checkFseDashboardPage() STANDARD_ERROR
    Nov 02, 2019 5:05:20 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 13 - let's create a new webdriver
    Nov 02, 2019 5:05:33 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:05:33 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:05:33 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:05:33 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (1268be3e3c0082cde1c81c8828ea3b04)

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[1] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[1] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[2] STANDARD_OUT


     Cookies is: [ ]

com.tablohub.Ui.DisinfectReportsPageTest > disinfectReportChooseFilterByLocation() PASSED

com.tablohub.Ui.DisinfectReportsPageTest STANDARD_ERROR
    Nov 02, 2019 5:05:58 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:05:58 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (eb799fc9166c689443c072941ffe64d9)
    Nov 02, 2019 5:05:58 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:05:59 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 745 ms
    Nov 02, 2019 5:05:59 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:05:59 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.UserManagement STANDARD_ERROR
    Nov 02, 2019 5:05:59 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:05:59 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:05:59 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.UserManagement > checkMtbrPage() STANDARD_ERROR
    Nov 02, 2019 5:05:59 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver

com.tablodash.Ui.FseDashboard > checkFseDashboardPage() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.UpTimeDashboard > checkUptimePage() PASSED

com.tablodash.Ui.UpTimeDashboard STANDARD_ERROR
    Nov 02, 2019 5:06:02 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:06:02 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (1268be3e3c0082cde1c81c8828ea3b04)
    Nov 02, 2019 5:06:02 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:06:03 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 961 ms
    Nov 02, 2019 5:06:03 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:06:03 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

Gradle Test Executor 1 STANDARD_ERROR
    Nov 02, 2019 5:06:29 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:06:30 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:06:30 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:06:30 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 13: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (ac02410b8f589f59201a64f66222df51)

com.tablodash.Ui.UserManagement > checkMtbrPage() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[2] PASSED

Gradle Test Executor 1 STANDARD_OUT


     Cookies is: [ ]
    org.openqa.selenium.InvalidArgumentException: invalid argument: log type 'performance' not found
      (Session info: chrome=76.0.3809.87)
    Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
    System info: host: 'ip-172-31-50-226', ip: '172.31.50.226', os.name: 'Linux', os.arch: 'amd64', os.version: '4.4.0-1096-aws', java.version: '1.8.0_222'
    Driver info: org.openqa.selenium.remote.RemoteWebDriver
    Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.87, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /tmp/.com.google.Chrome.ICfjc9}, goog:chromeOptions: {debuggerAddress: localhost:43528}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}
    Session ID: ac02410b8f589f59201a64f66222df51

com.tablodash.Ui.FseDashboard > checkFseDashboardPage() FAILED
    com.codeborne.selenide.ex.ElementNotFound at FseDashboard.java:38
        Caused by: org.openqa.selenium.NoSuchElementException at FseDashboard.java:38

com.tablodash.Ui.FseDashboard STANDARD_ERROR
    Nov 02, 2019 5:08:27 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:08:27 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (ac02410b8f589f59201a64f66222df51)
    Nov 02, 2019 5:08:27 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:08:28 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 527 ms
    Nov 02, 2019 5:08:28 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:08:28 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[3] STANDARD_ERROR
    Nov 02, 2019 5:08:47 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:08:48 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:08:48 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:08:48 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (714dc227576abf64b55ac1c495bb939b)

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[3] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[3] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[4] STANDARD_OUT


     Cookies is: [ ]
    org.openqa.selenium.InvalidArgumentException: invalid argument: log type 'performance' not found
      (Session info: chrome=76.0.3809.87)
    Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
    System info: host: 'ip-172-31-50-226', ip: '172.31.50.226', os.name: 'Linux', os.arch: 'amd64', os.version: '4.4.0-1096-aws', java.version: '1.8.0_222'
    Driver info: org.openqa.selenium.remote.RemoteWebDriver
    Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.87, chrome: {chromedriverVersion: 76.0.3809.68 (420c9498db8ce..., userDataDir: /tmp/.com.google.Chrome.tjWtec}, goog:chromeOptions: {debuggerAddress: localhost:44093}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}
    Session ID: 714dc227576abf64b55ac1c495bb939b

com.tablodash.Ui.UserManagement > checkMtbrPage() FAILED
    com.codeborne.selenide.ex.ElementNotFound at UserManagement.java:38
        Caused by: org.openqa.selenium.NoSuchElementException at UserManagement.java:38

com.tablodash.Ui.UserManagement STANDARD_ERROR
    Nov 02, 2019 5:09:54 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:09:54 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (714dc227576abf64b55ac1c495bb939b)
    Nov 02, 2019 5:09:54 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:09:54 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 384 ms
    Nov 02, 2019 5:09:54 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:09:54 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.BlackboxUpload STANDARD_ERROR
    Nov 02, 2019 5:09:54 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:09:54 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:09:54 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.BlackboxUpload > checkMtbrPage() STANDARD_ERROR
    Nov 02, 2019 5:09:54 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver
    Nov 02, 2019 5:10:10 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:10:10 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:10:10 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:10:10 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (53247afa37a468bd49300f5058e97a66)

com.tablodash.Ui.BlackboxUpload > checkMtbrPage() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BlackboxUpload > checkMtbrPage() PASSED

com.tablodash.Ui.BlackboxUpload STANDARD_ERROR
    Nov 02, 2019 5:10:18 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:10:18 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (53247afa37a468bd49300f5058e97a66)
    Nov 02, 2019 5:10:18 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:10:18 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 56 ms
    Nov 02, 2019 5:10:18 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:10:18 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.ResourceMap STANDARD_ERROR
    Nov 02, 2019 5:10:18 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:10:18 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:10:18 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.ResourceMap > checkResourceReport() STANDARD_ERROR
    Nov 02, 2019 5:10:18 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver
    Nov 02, 2019 5:10:20 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:10:20 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:10:20 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:10:20 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (f22f74e9df6b8c36cdde04759e7534b4)

com.tablodash.Ui.ResourceMap > checkResourceReport() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[4] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[5] STANDARD_OUT
    openResourceMapPage


     Cookies is: [ ]

com.tablodash.Ui.ResourceMap > checkResourceReport() PASSED

com.tablodash.Ui.ResourceMap STANDARD_ERROR
    Nov 02, 2019 5:10:33 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:10:33 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (f22f74e9df6b8c36cdde04759e7534b4)
    Nov 02, 2019 5:10:33 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:10:34 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 55 ms
    Nov 02, 2019 5:10:34 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:10:34 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.CustomerExperienceDashboard.CustomerExperienceDashboard STANDARD_ERROR
    Nov 02, 2019 5:10:34 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:10:34 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:10:34 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.CustomerExperienceDashboard.CustomerExperienceDashboard > enterToTabloDash() STANDARD_ERROR
    Nov 02, 2019 5:10:34 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver
    Nov 02, 2019 5:10:35 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:10:36 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:10:36 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:10:36 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (99fd1fddfd37b729e8169462c645df95)

com.tablodash.Ui.CustomerExperienceDashboard.CustomerExperienceDashboard > enterToTabloDash() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[5] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[6] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.CustomerExperienceDashboard.CustomerExperienceDashboard > enterToTabloDash() PASSED

com.tablodash.Ui.CustomerExperienceDashboard.CustomerExperienceDashboard STANDARD_ERROR
    Nov 02, 2019 5:11:21 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:11:21 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (99fd1fddfd37b729e8169462c645df95)
    Nov 02, 2019 5:11:21 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:11:21 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 348 ms
    Nov 02, 2019 5:11:21 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:11:21 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.HeatmapReport STANDARD_ERROR
    Nov 02, 2019 5:11:21 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:11:21 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:11:21 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

com.tablodash.Ui.HeatmapReport > checkHeatmapReport() STANDARD_ERROR
    Nov 02, 2019 5:11:21 PM com.codeborne.selenide.drivercommands.LazyDriver getAndCheckWebDriver
    INFO: No webdriver is bound to current thread: 12 - let's create a new webdriver
    Nov 02, 2019 5:11:41 PM org.openqa.selenium.remote.ProtocolHandshake createSession
    INFO: Detected dialect: W3C
    Nov 02, 2019 5:11:41 PM com.codeborne.selenide.webdriver.WebDriverFactory logBrowserVersion
    INFO: BrowserName=chrome Version=76.0.3809.87 Platform=LINUX
    Nov 02, 2019 5:11:41 PM com.codeborne.selenide.webdriver.WebDriverFactory createWebDriver
    INFO: Selenide v. 5.2.3
    Nov 02, 2019 5:11:41 PM com.codeborne.selenide.drivercommands.CreateDriverCommand createDriver
    INFO: Create webdriver in current thread 12: RemoteWebDriver -> RemoteWebDriver: chrome on LINUX (10160fd0e35eecc93fb15ce32a8839f3)

com.tablodash.Ui.HeatmapReport > checkHeatmapReport() STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[6] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[7] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.HeatmapReport > checkHeatmapReport() PASSED

com.tablodash.Ui.HeatmapReport STANDARD_ERROR
    Nov 02, 2019 5:12:50 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:12:50 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 12 -> RemoteWebDriver: chrome on LINUX (10160fd0e35eecc93fb15ce32a8839f3)
    Nov 02, 2019 5:12:50 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:12:50 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 12 in 105 ms
    Nov 02, 2019 5:12:50 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:12:50 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

Gradle Test Executor 2 STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[7] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[8] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[8] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[9] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[9] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[10] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[10] PASSED

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[11] STANDARD_OUT


     Cookies is: [ ]

com.tablodash.Ui.BusinessReview > checkBusinessReviewPage(String)[11] PASSED

com.tablodash.Ui.BusinessReview STANDARD_ERROR
    Nov 02, 2019 5:15:12 PM io.qameta.allure.AllureLifecycle startStep
    SEVERE: Could not start step: no test case running
    Nov 02, 2019 5:15:12 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Close webdriver: 13 -> RemoteWebDriver: chrome on LINUX (9c52b5635fe7011ef5bb0cb8909cddd6)
    Nov 02, 2019 5:15:12 PM com.codeborne.selenide.drivercommands.CloseBrowser run
    INFO: Trying to close the browser RemoteWebDriver ...
    Nov 02, 2019 5:15:12 PM com.codeborne.selenide.drivercommands.CloseDriverCommand run
    INFO: Closed webdriver 13 in 55 ms
    Nov 02, 2019 5:15:12 PM io.qameta.allure.AllureLifecycle updateStep
    SEVERE: Could not update step: no step running
    Nov 02, 2019 5:15:12 PM io.qameta.allure.AllureLifecycle stopStep
    SEVERE: Could not stop step: no step running

35 tests completed, 3 failed
There were failing tests. See the report at: file:///var/lib/jenkins/workspace/Automation-Tests-SMOKE/build/reports/tests/smokeTest/index.html

BUILD SUCCESSFUL in 15m 3s
6 actionable tasks: 5 executed, 1 up-to-date
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (MAKING TEST RESULT)
[Pipeline] script
[Pipeline] {
[Pipeline] step
[Automation-Tests-SMOKE] $ /var/lib/jenkins/tools/ru.yandex.qatools.allure.jenkins.tools.AllureCommandlineInstallation/Allure_CLI/bin/allure generate /var/lib/jenkins/workspace/Automation-Tests-SMOKE/build/allure-results -c -o /var/lib/jenkins/workspace/Automation-Tests-SMOKE/allure-report
Report successfully generated to /var/lib/jenkins/workspace/Automation-Tests-SMOKE/allure-report
Allure report was successfully generated.
Creating artifact for the build.
Artifact was added to the build.
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Declarative: Post Actions)
[Pipeline] cleanWs
[WS-CLEANUP] Deleting project workspace...
[WS-CLEANUP] Deferred wipeout is used...
[WS-CLEANUP] done
[Pipeline] echo
Current build state: UNSTABLE
[Pipeline] echo
Prev build state: SUCCESS
[Pipeline] script
[Pipeline] {
[Pipeline] emailext
Sending email to: amelnychenko@kaaiot.io ddidushko@kaaiot.io KAlpan@outsetmedical.com bpatel@outsetmedical.com AJamma@outsetmedical.com cpriyadarshini@outsetmedical.com akai@kaaiot.io dkozko@kaaiot.io spanasiuk@kaaiot.io sravindra@outsetmedical.com bsaienko@kaaiot.io rzapara@kaaiot.io
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // withCredentials
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: UNSTABLE
*/