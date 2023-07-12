// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.BackupDatasourceParameters;
import com.azure.resourcemanager.dataprotection.models.DataStoreParameters;
import com.azure.resourcemanager.dataprotection.models.DataStoreTypes;
import com.azure.resourcemanager.dataprotection.models.PolicyParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PolicyParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyParameters model =
            BinaryData
                .fromString(
                    "{\"dataStoreParametersList\":[{\"objectType\":\"DataStoreParameters\",\"dataStoreType\":\"OperationalStore\"},{\"objectType\":\"DataStoreParameters\",\"dataStoreType\":\"OperationalStore\"},{\"objectType\":\"DataStoreParameters\",\"dataStoreType\":\"ArchiveStore\"}],\"backupDatasourceParametersList\":[{\"objectType\":\"BackupDatasourceParameters\"},{\"objectType\":\"BackupDatasourceParameters\"}]}")
                .toObject(PolicyParameters.class);
        Assertions
            .assertEquals(DataStoreTypes.OPERATIONAL_STORE, model.dataStoreParametersList().get(0).dataStoreType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyParameters model =
            new PolicyParameters()
                .withDataStoreParametersList(
                    Arrays
                        .asList(
                            new DataStoreParameters().withDataStoreType(DataStoreTypes.OPERATIONAL_STORE),
                            new DataStoreParameters().withDataStoreType(DataStoreTypes.OPERATIONAL_STORE),
                            new DataStoreParameters().withDataStoreType(DataStoreTypes.ARCHIVE_STORE)))
                .withBackupDatasourceParametersList(
                    Arrays.asList(new BackupDatasourceParameters(), new BackupDatasourceParameters()));
        model = BinaryData.fromObject(model).toObject(PolicyParameters.class);
        Assertions
            .assertEquals(DataStoreTypes.OPERATIONAL_STORE, model.dataStoreParametersList().get(0).dataStoreType());
    }
}
