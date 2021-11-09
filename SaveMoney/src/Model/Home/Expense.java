/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Home;

import Model.Entity.Account;
import Model.Enum.ExpenseStatus;
import Model.Enum.FormOfPayment;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Renan
 */
public class Expense {
    private int Id;
    private Account AccountId;
    private Category CategoryId;
    private Card CardId;
    private BigDecimal Value;
    private Date Date;
    private String Description;
    private FormOfPayment FormOfPayment;
    private int NumberOfInstallments;
    private ExpenseStatus Status;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Account getAccountId() {
        return AccountId;
    }

    public void setAccountId(Account AccountId) {
        this.AccountId = AccountId;
    }

    public Category getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Category CategoryId) {
        this.CategoryId = CategoryId;
    }

    public Card getCardId() {
        return CardId;
    }

    public void setCardId(Card CardId) {
        this.CardId = CardId;
    }

    public BigDecimal getValue() {
        return Value;
    }

    public void setValue(BigDecimal Value) {
        this.Value = Value;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public FormOfPayment getFormOfPayment() {
        return FormOfPayment;
    }

    public void setFormOfPayment(FormOfPayment FormOfPayment) {
        this.FormOfPayment = FormOfPayment;
    }

    public int getNumberOfInstallments() {
        return NumberOfInstallments;
    }

    public void setNumberOfInstallments(int NumberOfInstallments) {
        this.NumberOfInstallments = NumberOfInstallments;
    }

    public ExpenseStatus getStatus() {
        return Status;
    }

    public void setStatus(ExpenseStatus Status) {
        this.Status = Status;
    }
}
