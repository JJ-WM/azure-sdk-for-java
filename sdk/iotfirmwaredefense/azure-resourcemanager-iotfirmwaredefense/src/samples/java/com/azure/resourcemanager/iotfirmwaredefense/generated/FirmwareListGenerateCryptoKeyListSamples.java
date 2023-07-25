// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.generated;

/** Samples for Firmware ListGenerateCryptoKeyList. */
public final class FirmwareListGenerateCryptoKeyListSamples {
    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/preview/2023-02-08-preview/examples/Firmware_ListGenerateCryptoKeyList_MinimumSet_Gen.json
     */
    /**
     * Sample code: Firmware_ListGenerateCryptoKeyList_MinimumSet_Gen.
     *
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void firmwareListGenerateCryptoKeyListMinimumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager
            .firmwares()
            .listGenerateCryptoKeyList(
                "rgworkspaces-firmwares", "j5QE_", "wujtpcgypfpqseyrsebolarkspy", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/fist/resource-manager/Microsoft.IoTFirmwareDefense/preview/2023-02-08-preview/examples/Firmware_ListGenerateCryptoKeyList_MaximumSet_Gen.json
     */
    /**
     * Sample code: Firmware_ListGenerateCryptoKeyList_MaximumSet_Gen.
     *
     * @param manager Entry point to IoTFirmwareDefenseManager.
     */
    public static void firmwareListGenerateCryptoKeyListMaximumSetGen(
        com.azure.resourcemanager.iotfirmwaredefense.IoTFirmwareDefenseManager manager) {
        manager
            .firmwares()
            .listGenerateCryptoKeyList(
                "FirmwareAnalysisRG",
                "default",
                "DECAFBAD-0000-0000-0000-BADBADBADBAD",
                com.azure.core.util.Context.NONE);
    }
}
