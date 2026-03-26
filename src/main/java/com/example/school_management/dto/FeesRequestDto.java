package com.example.school_management.dto;

import com.example.school_management.enums.FineType;
import com.example.school_management.enums.PaymentCycle;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
public class FeesRequestDto
{
    @NotNull(message = "Standard (class) is required")
    @Min(value = 1, message = "Standard must be at least 1")
    @Max(value = 12, message = "Standard must be at most 12")
    private Integer std;

    @NotEmpty(message = "At least one fee item is required")
    @Valid
    private List<FeeItemDTO> feeItems;

    @NotNull(message = "Payment cycle is required")
    private PaymentCycle paymentCycle;

    @NotNull(message = "Academic year is required")
    @Min(value = 2000, message = "Academic year must be 2000 or later")
    @Max(value = 2100, message = "Academic year must be 2100 or earlier")
    private Integer academicYear;

    private FineType fineType;

    @DecimalMin(value = "0.0", message = "Fine amount cannot be negative")
    private BigDecimal fineAmount;

    @Data
    public static class FeeItemDTO {

        @NotNull(message = "Fee type is required")
        private com.example.school_management.enums.FeeType feeType;

        @NotNull(message = "Amount is required")
        @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
        @Digits(integer = 10, fraction = 2, message = "Invalid amount format")
        private BigDecimal amount;
    }
}