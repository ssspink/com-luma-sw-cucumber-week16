package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenTest {



    @When("Mouse Hover on Men Menu")
    public void mouseHoverOnMenMenu() {

    }

    @And("Mouse Hover on Bottoms")
    public void mouseHoverOnBottoms() {

    }

    @And("Click on Pants")
    public void clickOnPants() {
      new HomePage().clickOnPants();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on size {int}.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnSize(int PantsSize)
    {
        new PantsPage().getTextAddedPantToShoppingCart();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on colour Black{int}.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack(int BlackCol) {
        new PantsPage().hoverAndClickProductColour();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on colour Black.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new PantsPage().hoverAndClickProductColour();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new PantsPage().getTextAddedPantToShoppingCart();
    }

    @And("Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’{String}")
    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {

    }

    @And("Click on shopping cart Link into message")
    public void clickOnShoppingCartLinkIntoMessage() {
        new ShoppingCartPage().getTextShoppingCart();
    }

    @And("Verify the text ‘Shopping Cart.’")
    public void verifyTheTextShoppingCart() {
        new ShoppingCartPage().getTextShoppingCart();
    }

    @And("Verify the product name ‘Cronus Yoga Pant’")
    public void verifyTheProductNameCronusYogaPant() {
        new ShoppingCartPage().verifyTheProductName();
    }

    @And("Verify the product size {string}")
    public void verifyTheProductSize(String ProductSize) {
        new ShoppingCartPage().getTextSize32();
    }

    @Then("Verify the product colour {string}")
    public void verifyTheProductColour(String ProductColour) {
        new ShoppingCartPage().getTextBlack();
    }
}
