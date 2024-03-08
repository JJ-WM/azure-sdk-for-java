// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apicenter.models.ApiListResult;

public final class ApiListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"title\":\"eiwaopvkmi\",\"kind\":\"graphql\",\"description\":\"mxdcufufsrp\",\"summary\":\"zidnsezcxtbzsgfy\",\"lifecycleStage\":\"development\",\"termsOfService\":{\"url\":\"ewmdw\"},\"externalDocumentation\":[{\"title\":\"ac\",\"description\":\"oosflnr\",\"url\":\"sfqpteehz\"},{\"title\":\"ypyqrimzinp\",\"description\":\"wjdk\",\"url\":\"rsoodqxhcrmnoh\"},{\"title\":\"ckwhds\",\"description\":\"fiyipjxsqwpgrj\",\"url\":\"znorcj\"},{\"title\":\"snb\",\"description\":\"qabnmoc\",\"url\":\"cyshurzafbljjgp\"}],\"contacts\":[{\"name\":\"c\",\"url\":\"klj\",\"email\":\"bqidtqaj\"}],\"license\":{\"name\":\"l\",\"url\":\"u\",\"identifier\":\"krlkhbzhfepg\"},\"customProperties\":\"dataqex\"},\"id\":\"ocxscpaierhhbcs\",\"name\":\"l\",\"type\":\"mmajtjaodx\"},{\"properties\":{\"title\":\"nbdxk\",\"kind\":\"rest\",\"description\":\"okaj\",\"summary\":\"npime\",\"lifecycleStage\":\"retired\",\"termsOfService\":{\"url\":\"xgcp\"},\"externalDocumentation\":[{\"title\":\"aajrm\",\"description\":\"jwzrl\",\"url\":\"vmclw\"},{\"title\":\"j\",\"description\":\"ejctbzaqsqsycb\",\"url\":\"bfkgukdkex\"}],\"contacts\":[{\"name\":\"fmxa\",\"url\":\"fjpgddtocjjxhvp\",\"email\":\"uexhdzx\"}],\"license\":{\"name\":\"eojnxqbzvddn\",\"url\":\"ndei\",\"identifier\":\"twnpzaoqvuhrhcf\"},\"customProperties\":\"datayd\"},\"id\":\"lmjthjq\",\"name\":\"wpyeicxmqciwqvh\",\"type\":\"hix\"},{\"properties\":{\"title\":\"gdtopbobjogh\",\"kind\":\"rest\",\"description\":\"u\",\"summary\":\"a\",\"lifecycleStage\":\"retired\",\"termsOfService\":{\"url\":\"ayvvtpgvdf\"},\"externalDocumentation\":[{\"title\":\"kftutqxlngxlefg\",\"description\":\"nxkrx\",\"url\":\"qmi\"},{\"title\":\"thz\",\"description\":\"qdrabhjybigehoqf\",\"url\":\"owskanyktz\"},{\"title\":\"u\",\"description\":\"wgqyw\",\"url\":\"ndrvynhzg\"},{\"title\":\"hrc\",\"description\":\"nc\",\"url\":\"cpecfvmmcoofs\"}],\"contacts\":[{\"name\":\"v\",\"url\":\"m\",\"email\":\"qabcypm\"},{\"name\":\"kwlzuvccfwnfn\",\"url\":\"cfionl\",\"email\":\"x\"}],\"license\":{\"name\":\"gtzxdpn\",\"url\":\"qqwx\",\"identifier\":\"feallnwsu\"},\"customProperties\":\"datasnjampmng\"},\"id\":\"scxaq\",\"name\":\"ooch\",\"type\":\"bonqvpkvlrxnjeas\"}],\"nextLink\":\"pheoflokeyy\"}")
            .toObject(ApiListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiListResult model = new ApiListResult();
        model = BinaryData.fromObject(model).toObject(ApiListResult.class);
    }
}
