/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author alum.fial8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class invoces {
    private int id;
    private int order_id;
    private String invoces_date;
    private String due_date;
    private double tax;
    private double shipping;
    private double amount_due;
}
