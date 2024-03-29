package com.example.sneakoverse.pojo;

import com.example.sneakoverse.entity.AdminPage;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminPagePojo {
    private Integer id;

    @NotEmpty(message = "name can't be empty")
    private String item_name;

    @NotEmpty(message = "price can't be empty")
    private String item_price;

//    @NotEmpty(message = "Rating can't be empty")
    private Integer item_rating;

    private MultipartFile image;

    public AdminPagePojo(AdminPage adminPage){
        this.id=adminPage.getId();
        this.item_name = adminPage.getItem_name();
        this.item_price = adminPage.getItem_price();
        this.item_rating = adminPage.getItem_rating();
    }
}
