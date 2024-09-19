package pageObjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverManager.WebdriverManager;

public class TreePage {

	WebDriver driver = WebdriverManager.getDriver();

	@FindBy(xpath = "//h5[text()='Tree']/../a[text()='Get Started']")
	WebElement getStarted;

	// @FindBy(xpath = "//a[text()='Overview of Trees']")
	@FindBy(xpath = "//h4[@class='bg-secondary text-white']/../ul/a[text()='Overview of Trees']")
	WebElement overviewTrees;

	// @FindBy(xpath ="//div[@class='CodeMirror cm-s-default']")
	@FindBy(xpath = "//div[@class='container']/div/form/div/div/div/textarea")
	WebElement editorText;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHere;

	@FindBy(xpath = "//button[text()='Run']")
	WebElement run;

	@FindBy(xpath = "//a[text()='Terminologies']")
	WebElement terminologies;

	@FindBy(xpath = "//a[text()='Types of Trees']")
	WebElement typesOfTrees;

	@FindBy(xpath = "//a[text()='Tree Traversals']")
	WebElement treeTraversals;

	@FindBy(xpath = "//a[text()='Traversals-Illustration']")
	WebElement traversalsIllustrations;

	@FindBy(xpath = "//a[text()='Binary Trees']")
	WebElement binaryTrees;

	@FindBy(xpath = "//a[text()='Types of Binary Trees']")
	WebElement typesOfBinaryTrees;

	@FindBy(xpath = "//a[text()='Implementation in Python']")
	WebElement implemetationInPython;

	@FindBy(xpath = "//a[text()='Binary Tree Traversals']']")
	WebElement binaryTreesTraversals;

	@FindBy(xpath = "//a[text()='Implementation of Binary Trees']")
	WebElement implementationBinaryTrees;

	@FindBy(xpath = "//a[text()='Applications of Binary trees']")
	WebElement applicationBinaryTrees;

	@FindBy(xpath = "//a[text()='Binary Search Trees']")
	WebElement binarySearchTrees;

	@FindBy(xpath = "//a[text()='Implementation Of BST']")
	WebElement implementationBst;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestions;

	public void getStarted() {
		getStarted.click();
	}
	
	public void overviewTrees() {
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.elementToBeClickable(overviewTrees)).click();
	}
	
	public void editorText() {
		String print = "print" + "\"Hello\"" + ";";
		editorText.sendKeys(print);
	}
	
	public void tryHere() {
		tryHere.click();
	}
	
	public void run() {
		run.click();
	}

	public void terminologies() {
		terminologies.click();
	}

	public void typesOfTrees() {
		typesOfTrees.click();
	}

	public void treeTraversals() {
		treeTraversals.click();
	}

	public void traversalsIllustrations() {
		traversalsIllustrations.click();
	}

	public void binaryTrees() {
		binaryTrees.click();
	}

	public void typesOfBinaryTrees() {
		typesOfBinaryTrees.click();
	}

	public void implemetationInPython() {
		implemetationInPython.click();
	}

	public void binaryTreesTraversals() {
		binaryTreesTraversals.click();
	}

	public void implementationBinaryTrees() {
		implementationBinaryTrees.click();
	}

	public void applicationBinaryTrees() {
		applicationBinaryTrees.click();
	}

	public void binarySearchTrees() {
		binarySearchTrees.click();
	}

	public void implementationBst() {
		implementationBst.click();
	}

	public void practiceQuestions() {
		practiceQuestions.click();
	}

	public void backward() {
		driver.navigate().back();

	}

	public String titlePage() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public void ValidateTreeTitle() {
		Assert.assertEquals(titlePage(), "Tree");
	}

	public void ValidateOverviewTrees() {
		Assert.assertEquals(titlePage(), "Tree");
	}

	public TreePage() {
		PageFactory.initElements(driver, this);
	}

}
