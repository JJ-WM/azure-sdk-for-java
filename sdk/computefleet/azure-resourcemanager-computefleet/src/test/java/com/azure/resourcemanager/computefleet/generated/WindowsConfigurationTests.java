// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computefleet.models.AdditionalUnattendContent;
import com.azure.resourcemanager.computefleet.models.AdditionalUnattendContentComponentName;
import com.azure.resourcemanager.computefleet.models.AdditionalUnattendContentPassName;
import com.azure.resourcemanager.computefleet.models.PatchSettings;
import com.azure.resourcemanager.computefleet.models.ProtocolTypes;
import com.azure.resourcemanager.computefleet.models.SettingNames;
import com.azure.resourcemanager.computefleet.models.WindowsConfiguration;
import com.azure.resourcemanager.computefleet.models.WindowsPatchAssessmentMode;
import com.azure.resourcemanager.computefleet.models.WindowsVMGuestPatchAutomaticByPlatformRebootSetting;
import com.azure.resourcemanager.computefleet.models.WindowsVMGuestPatchAutomaticByPlatformSettings;
import com.azure.resourcemanager.computefleet.models.WindowsVMGuestPatchMode;
import com.azure.resourcemanager.computefleet.models.WinRMConfiguration;
import com.azure.resourcemanager.computefleet.models.WinRMListener;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WindowsConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WindowsConfiguration model = BinaryData.fromString(
            "{\"provisionVMAgent\":false,\"enableAutomaticUpdates\":true,\"timeZone\":\"jbp\",\"additionalUnattendContent\":[{\"passName\":\"OobeSystem\",\"componentName\":\"Microsoft-Windows-Shell-Setup\",\"settingName\":\"AutoLogon\",\"content\":\"cjrwzoxxjtfellu\"},{\"passName\":\"OobeSystem\",\"componentName\":\"Microsoft-Windows-Shell-Setup\",\"settingName\":\"AutoLogon\",\"content\":\"eqfpj\"},{\"passName\":\"OobeSystem\",\"componentName\":\"Microsoft-Windows-Shell-Setup\",\"settingName\":\"FirstLogonCommands\",\"content\":\"vhpfxxypininmay\"},{\"passName\":\"OobeSystem\",\"componentName\":\"Microsoft-Windows-Shell-Setup\",\"settingName\":\"AutoLogon\",\"content\":\"depoog\"}],\"patchSettings\":{\"patchMode\":\"AutomaticByPlatform\",\"enableHotpatching\":false,\"assessmentMode\":\"AutomaticByPlatform\",\"automaticByPlatformSettings\":{\"rebootSetting\":\"Never\",\"bypassPlatformSafetyChecksOnUserSchedule\":true}},\"winRM\":{\"listeners\":[{\"protocol\":\"Https\",\"certificateUrl\":\"eotusivyevc\"},{\"protocol\":\"Http\",\"certificateUrl\":\"hn\"},{\"protocol\":\"Http\",\"certificateUrl\":\"bwjzr\"},{\"protocol\":\"Https\",\"certificateUrl\":\"xgispemvtzfkufu\"}]},\"enableVMAgentPlatformUpdates\":false}")
            .toObject(WindowsConfiguration.class);
        Assertions.assertEquals(false, model.provisionVMAgent());
        Assertions.assertEquals(true, model.enableAutomaticUpdates());
        Assertions.assertEquals("jbp", model.timeZone());
        Assertions.assertEquals(AdditionalUnattendContentPassName.OOBE_SYSTEM,
            model.additionalUnattendContent().get(0).passName());
        Assertions.assertEquals(AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP,
            model.additionalUnattendContent().get(0).componentName());
        Assertions.assertEquals(SettingNames.AUTO_LOGON, model.additionalUnattendContent().get(0).settingName());
        Assertions.assertEquals("cjrwzoxxjtfellu", model.additionalUnattendContent().get(0).content());
        Assertions.assertEquals(WindowsVMGuestPatchMode.AUTOMATIC_BY_PLATFORM, model.patchSettings().patchMode());
        Assertions.assertEquals(false, model.patchSettings().enableHotpatching());
        Assertions.assertEquals(WindowsPatchAssessmentMode.AUTOMATIC_BY_PLATFORM,
            model.patchSettings().assessmentMode());
        Assertions.assertEquals(WindowsVMGuestPatchAutomaticByPlatformRebootSetting.NEVER,
            model.patchSettings().automaticByPlatformSettings().rebootSetting());
        Assertions.assertEquals(true,
            model.patchSettings().automaticByPlatformSettings().bypassPlatformSafetyChecksOnUserSchedule());
        Assertions.assertEquals(ProtocolTypes.HTTPS, model.winRM().listeners().get(0).protocol());
        Assertions.assertEquals("eotusivyevc", model.winRM().listeners().get(0).certificateUrl());
        Assertions.assertEquals(false, model.enableVMAgentPlatformUpdates());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WindowsConfiguration model = new WindowsConfiguration().withProvisionVMAgent(false)
            .withEnableAutomaticUpdates(true)
            .withTimeZone("jbp")
            .withAdditionalUnattendContent(Arrays.asList(
                new AdditionalUnattendContent().withPassName(AdditionalUnattendContentPassName.OOBE_SYSTEM)
                    .withComponentName(AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP)
                    .withSettingName(SettingNames.AUTO_LOGON)
                    .withContent("cjrwzoxxjtfellu"),
                new AdditionalUnattendContent().withPassName(AdditionalUnattendContentPassName.OOBE_SYSTEM)
                    .withComponentName(AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP)
                    .withSettingName(SettingNames.AUTO_LOGON)
                    .withContent("eqfpj"),
                new AdditionalUnattendContent().withPassName(AdditionalUnattendContentPassName.OOBE_SYSTEM)
                    .withComponentName(AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP)
                    .withSettingName(SettingNames.FIRST_LOGON_COMMANDS)
                    .withContent("vhpfxxypininmay"),
                new AdditionalUnattendContent().withPassName(AdditionalUnattendContentPassName.OOBE_SYSTEM)
                    .withComponentName(AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP)
                    .withSettingName(SettingNames.AUTO_LOGON)
                    .withContent("depoog")))
            .withPatchSettings(new PatchSettings().withPatchMode(WindowsVMGuestPatchMode.AUTOMATIC_BY_PLATFORM)
                .withEnableHotpatching(false)
                .withAssessmentMode(WindowsPatchAssessmentMode.AUTOMATIC_BY_PLATFORM)
                .withAutomaticByPlatformSettings(new WindowsVMGuestPatchAutomaticByPlatformSettings()
                    .withRebootSetting(WindowsVMGuestPatchAutomaticByPlatformRebootSetting.NEVER)
                    .withBypassPlatformSafetyChecksOnUserSchedule(true)))
            .withWinRM(new WinRMConfiguration().withListeners(
                Arrays.asList(new WinRMListener().withProtocol(ProtocolTypes.HTTPS).withCertificateUrl("eotusivyevc"),
                    new WinRMListener().withProtocol(ProtocolTypes.HTTP).withCertificateUrl("hn"),
                    new WinRMListener().withProtocol(ProtocolTypes.HTTP).withCertificateUrl("bwjzr"),
                    new WinRMListener().withProtocol(ProtocolTypes.HTTPS).withCertificateUrl("xgispemvtzfkufu"))))
            .withEnableVMAgentPlatformUpdates(false);
        model = BinaryData.fromObject(model).toObject(WindowsConfiguration.class);
        Assertions.assertEquals(false, model.provisionVMAgent());
        Assertions.assertEquals(true, model.enableAutomaticUpdates());
        Assertions.assertEquals("jbp", model.timeZone());
        Assertions.assertEquals(AdditionalUnattendContentPassName.OOBE_SYSTEM,
            model.additionalUnattendContent().get(0).passName());
        Assertions.assertEquals(AdditionalUnattendContentComponentName.MICROSOFT_WINDOWS_SHELL_SETUP,
            model.additionalUnattendContent().get(0).componentName());
        Assertions.assertEquals(SettingNames.AUTO_LOGON, model.additionalUnattendContent().get(0).settingName());
        Assertions.assertEquals("cjrwzoxxjtfellu", model.additionalUnattendContent().get(0).content());
        Assertions.assertEquals(WindowsVMGuestPatchMode.AUTOMATIC_BY_PLATFORM, model.patchSettings().patchMode());
        Assertions.assertEquals(false, model.patchSettings().enableHotpatching());
        Assertions.assertEquals(WindowsPatchAssessmentMode.AUTOMATIC_BY_PLATFORM,
            model.patchSettings().assessmentMode());
        Assertions.assertEquals(WindowsVMGuestPatchAutomaticByPlatformRebootSetting.NEVER,
            model.patchSettings().automaticByPlatformSettings().rebootSetting());
        Assertions.assertEquals(true,
            model.patchSettings().automaticByPlatformSettings().bypassPlatformSafetyChecksOnUserSchedule());
        Assertions.assertEquals(ProtocolTypes.HTTPS, model.winRM().listeners().get(0).protocol());
        Assertions.assertEquals("eotusivyevc", model.winRM().listeners().get(0).certificateUrl());
        Assertions.assertEquals(false, model.enableVMAgentPlatformUpdates());
    }
}
