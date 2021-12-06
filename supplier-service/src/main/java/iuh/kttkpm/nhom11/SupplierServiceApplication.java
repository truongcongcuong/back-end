package iuh.kttkpm.nhom11;

import iuh.kttkpm.nhom11.entity.Supplier;
import iuh.kttkpm.nhom11.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SupplierServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SupplierServiceApplication.class, args);
    }

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i <= 4; i++) {
            var supplier = Supplier.builder()
                    .id((long) i)
                    .name("supplier " + i)
                    .address("address supplier " + i)
                    .email("email supplier " + i)
                    .phone("phone supplier " + i)
                    .build();
            supplierRepository.save(supplier);
        }
    }
}
