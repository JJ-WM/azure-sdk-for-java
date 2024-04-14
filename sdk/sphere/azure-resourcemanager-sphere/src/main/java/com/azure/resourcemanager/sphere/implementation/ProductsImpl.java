// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sphere.fluent.ProductsClient;
import com.azure.resourcemanager.sphere.fluent.models.CountDevicesResponseInner;
import com.azure.resourcemanager.sphere.fluent.models.DeviceGroupInner;
import com.azure.resourcemanager.sphere.fluent.models.ProductInner;
import com.azure.resourcemanager.sphere.models.CountDevicesResponse;
import com.azure.resourcemanager.sphere.models.DeviceGroup;
import com.azure.resourcemanager.sphere.models.Product;
import com.azure.resourcemanager.sphere.models.Products;

public final class ProductsImpl implements Products {
    private static final ClientLogger LOGGER = new ClientLogger(ProductsImpl.class);

    private final ProductsClient innerClient;

    private final com.azure.resourcemanager.sphere.AzureSphereManager serviceManager;

    public ProductsImpl(ProductsClient innerClient,
        com.azure.resourcemanager.sphere.AzureSphereManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Product> listByCatalog(String resourceGroupName, String catalogName) {
        PagedIterable<ProductInner> inner = this.serviceClient().listByCatalog(resourceGroupName, catalogName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> listByCatalog(String resourceGroupName, String catalogName, Context context) {
        PagedIterable<ProductInner> inner = this.serviceClient().listByCatalog(resourceGroupName, catalogName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public Response<Product> getWithResponse(String resourceGroupName, String catalogName, String productName,
        Context context) {
        Response<ProductInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, catalogName, productName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Product get(String resourceGroupName, String catalogName, String productName) {
        ProductInner inner = this.serviceClient().get(resourceGroupName, catalogName, productName);
        if (inner != null) {
            return new ProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String catalogName, String productName) {
        this.serviceClient().delete(resourceGroupName, catalogName, productName);
    }

    public void delete(String resourceGroupName, String catalogName, String productName, Context context) {
        this.serviceClient().delete(resourceGroupName, catalogName, productName, context);
    }

    public Response<CountDevicesResponse> countDevicesWithResponse(String resourceGroupName, String catalogName,
        String productName, Context context) {
        Response<CountDevicesResponseInner> inner
            = this.serviceClient().countDevicesWithResponse(resourceGroupName, catalogName, productName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new CountDevicesResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CountDevicesResponse countDevices(String resourceGroupName, String catalogName, String productName) {
        CountDevicesResponseInner inner
            = this.serviceClient().countDevices(resourceGroupName, catalogName, productName);
        if (inner != null) {
            return new CountDevicesResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DeviceGroup> generateDefaultDeviceGroups(String resourceGroupName, String catalogName,
        String productName) {
        PagedIterable<DeviceGroupInner> inner
            = this.serviceClient().generateDefaultDeviceGroups(resourceGroupName, catalogName, productName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DeviceGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<DeviceGroup> generateDefaultDeviceGroups(String resourceGroupName, String catalogName,
        String productName, Context context) {
        PagedIterable<DeviceGroupInner> inner
            = this.serviceClient().generateDefaultDeviceGroups(resourceGroupName, catalogName, productName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DeviceGroupImpl(inner1, this.manager()));
    }

    public Product getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String catalogName = ResourceManagerUtils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        String productName = ResourceManagerUtils.getValueFromIdByName(id, "products");
        if (productName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        return this.getWithResponse(resourceGroupName, catalogName, productName, Context.NONE).getValue();
    }

    public Response<Product> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String catalogName = ResourceManagerUtils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        String productName = ResourceManagerUtils.getValueFromIdByName(id, "products");
        if (productName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        return this.getWithResponse(resourceGroupName, catalogName, productName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String catalogName = ResourceManagerUtils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        String productName = ResourceManagerUtils.getValueFromIdByName(id, "products");
        if (productName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        this.delete(resourceGroupName, catalogName, productName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String catalogName = ResourceManagerUtils.getValueFromIdByName(id, "catalogs");
        if (catalogName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'catalogs'.", id)));
        }
        String productName = ResourceManagerUtils.getValueFromIdByName(id, "products");
        if (productName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        this.delete(resourceGroupName, catalogName, productName, context);
    }

    private ProductsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sphere.AzureSphereManager manager() {
        return this.serviceManager;
    }

    public ProductImpl define(String name) {
        return new ProductImpl(name, this.manager());
    }
}
