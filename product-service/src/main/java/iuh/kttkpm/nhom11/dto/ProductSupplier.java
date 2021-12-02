package iuh.kttkpm.nhom11.dto;

import iuh.kttkpm.nhom11.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProductSupplier implements Serializable {
    private Product product;
    private Supplier supplier;
}
