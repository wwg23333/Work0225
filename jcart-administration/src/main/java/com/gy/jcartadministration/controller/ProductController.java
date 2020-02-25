package com.gy.jcartadministration.controller;

import com.gy.jcartadministration.dto.in.product.ProductCreateInDTO;
import com.gy.jcartadministration.dto.in.product.ProductSearchInDTO;
import com.gy.jcartadministration.dto.out.PageOutDTO;
import com.gy.jcartadministration.dto.out.product.ProductListOutDTO;
import com.gy.jcartadministration.dto.out.product.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,@RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
