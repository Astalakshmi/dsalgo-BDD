@Tree
    Feature: Ds Portal Tree Page Functionality
    
    Background: Successful login with valid credentials 
    Given The user navigates to the login page
    When The user enters a valid username and password
    Then clicks the login button 	
    	
    @Tree_GetStarted @TreeTC_001
    Scenario: Validate the TreeModule page by clicking Get Started
    Given user is on the DsAlgo portal home page    
    When user clicked on the Tree Get Started link button
    Then user is able to view the TreeModule Page
      
    @Tree_OverviewTrees  @TreeTC_002
    Scenario:Validate the TreeModule Page Overview of Trees link
    Given user is on the Tree module page  
    When user clicked the overview of Trees link 
    Then user is able to view the overview of Trees Page

		 @OverviewTrees_Tryhere @TreeTC_003
		 Scenario: Validate  the Overview of Trees Try here	
		 Given user is on the Overview of Trees Page	
		 When user clicked the Try here link from the Overview of Trees Page
		 Then user is able to view the Try here Editor page																					

     @Tree_Terminologies	@TreeTC_004
     Scenario: Validate the TreeModulePage Terminologies link
     Given user is on the Tree module page 
     When user clicked Terminologies link on the TreeModule page	
     Then user is able to view the Terminologies linked page		
		 
		 @Terminologies_Tryhere @TreeTC_005
		 Scenario: Validate the Terminologies Try here
		 Given user is on the Terminologies page	
		 When user clicked the Try here on the Terminologies page		
		 Then user is able to view the Try here Editor page		
		 
		 @Tree_TypesTrees @TreeTC_006
		 Scenario: Validate the TreeModule Page Types of Trees link
		 Given user is on the Tree module page  	
		 When user clicked Types of Trees link in the TreeModulepage	
		 Then user is able to view the Types of Trees linked page						
		 
		 @TypeTrees_Tryhere @TreeTC_007
		 Scenario: Validate the  Type of Trees Try here 	
		 Given user is on the Type of Trees page
		 When user clicked the Try here on the Types of Trees page		
		 Then user is able to view the Try here Editor page		
		 
		 @Tree_TreeTraversals	@TreeTC_008
		 Scenario: Validate the TreeModule Page Tree Traversals link
		 Given user is on the Tree module page  	
		 When user clicked Tree Traversals link in the TreeModule page
		 Then user is able to view the Tree Traversals linked page

		 
		 @Traversals_Tryhere	@TreeTC_009
		 Scenario: Validate the  Tree Traversals Try here
		 Given user is on the Tree Traversals	
		 When user clicked the Try here on the Tree Traversals page		
		 Then user is able to view the  Try here Editor page	
		 
		 @Traversals_Illustration @TreeTC_010	
		 Scenario: Validate the TreeModule Page Traversals Illustration link
		 Given user is on the Tree module page  	
		 When user clicked Traversals Illustration link in the TreeModule page
		 Then user is able to view the Traversals Illustration linked page 
		 
		 @Illustration_Tryhere	@TreeTC_011
		 Scenario: Validate the Traversals Illustration Try here
		 Given user is on the Traversals Illustration	
		 When user clicked the Try here on the Traversals Illustration page
		 Then user should get navigated to Try here Editor page		
		 
		 @Tree_BinaryTrees	@TreeTC_012
		 Scenario: Validate the TreeModule Page-Binary Trees link
		 Given user is on the Tree module page  	
		 When user clicked Binary Trees link in the TreeModule page
		 Then user is able to view the Binary Trees page	
		 
		 @BinaryTrees_Tryhere @TreeTC_0013
		 Scenario:  Validate the Binary Trees Try here
		 Given user is on the Binary Trees page
		 When user clicked the Try here on the Binary Trees page
		 Then user should get navigated to Try here Editor page			
		 
		 @TypesBinaryTrees	@TreeTC_014
		 Scenario: Validate the TreeModule Page Types of Binary Trees link
		 Given user is on the Tree module page  	
		 When user clicked Types of Binary Trees link in the TreeModule page
		 Then user is able to view the  Types of Binary Tree linked page
		 
		 
		 @TypesBinary_Tryhere @TreeTC_015
		 Scenario: Validate the Types of Binary Trees Try here
		 Given user is on the Types of Binary Trees
     When user clicked the Try here on the Types of Binary Trees page
     Then user should get navigated to Try here Editor page		
     
     @Imp_Python @TreeTC_016
     Scenario: Validate the TreeModule Page Implementations in Python link
     Given user is on the Tree module page  
     When user clicked Implementations in Python link in the TreeModule page	
     Then user is able to view the  Implementations in Python link page
     
     @Imp_Python_Tryhere @TreeTC_017
     Scenario: Validate the Implementations in Python Try here
     Given user is on the Implementations in Python
		 When user clicked the Try here on the Implementations in Python Tree page	
		 Then user should get navigated to Try here Editor page
		 
		 @Tree_BinaryTraversals @TreeTC_018
		 Scenario: Validate the TreeModule Page Binary Tree Traversals link
		 Given user is on the Tree module page  	
		 When user clicked Binary Tree Traversals link in the TreeModule page
		 Then user is able to view the Binary Tree Traversals linked page
		 
		 @BinaryTraversals_Tryhere	 @TreeTC_019
		 Scenario: Validate the Binary Tree Traversals Try here
		 Given user is on the Binary Tree Traversals
		 When user clicked the Try here on the Binary Tree Traversals page	
		 Then user should get navigated to Try here Editor page		
		 
		 @Imp_BinaryTrees @TreeTC_020
		 Scenario: Validate the TreeModule Page Implementation of Binary Trees link
		 Given user is on the Tree module page 
		 When user clicked Implementation of Binary Trees link in the TreeModule page	
		 Then user is able to view the Implementation of Binary Trees link page
		 
		 @Imp_BinaryTreesTryhere @TreeTC_021
		 Scenario: Validate the Implementation of Binary Trees-Try here
		 Given user is on the Implementation of Binary Trees
		 When user clicked the Try here on theImplementation of Binary Trees page	
		 Then user should get navigated to Try here Editor page
		 
		 @Tree_AppBinarytrees @TreeTC_022
		 Scenario: Validate the TreeModule Page Applications of Binary trees link
		 Given user is on the Tree module page  
		 When user clicked Applications of Binary trees link in the TreeModule page
		 Then user is able to view the Applications of Binary trees link page
		 
		 @AppBinary_Tryhere @TreeTC_023
		 Scenario: Validate the Applications of Binary trees Try here
		 Given user is on the Applications of Binary trees
		 When user clicked the Try here on the Applications of Binary trees page	
		 Then user should get navigated to Try here Editor page				
		 
		 @AppBinarytrees @TreeTC_024
		 Scenario: Validate the TreeModule Page Applications of Binary trees link
		 Given user is on the Tree module page  
		 When user clicked Applications of Binary trees link in the TreeModule page
		 Then user is able to view the  Applications of Binary trees link page
		 
		 @AppBinarytrees_Tryhere @TreeTC_025
		 Scenario: Validate the Applications of Binary trees-Try here
		 Given user is on the Applications of Binary trees
     When user clicked the Try here on the Applications of Binary trees page
     Then user should get navigated to Try here Editor page	
     
     @BinarySearchTrees @TreeTC_026
     Scenario: Validate the TreeModule_Page Binary Search Trees link
     Given user is on the Tree module page  
     When user clicked Binary Search Trees link in the TreeModule page
     Then user is able to view the  Binary Search Trees linked page
     
     @BinaryTrees_Tryhere @TreeTC_027
     Scenario: Validate the Binary Search Trees Try here
     Given user is on the Binary Search Trees
     When user clicked the Try here on the Binary Search Trees page
     Then user should get navigated to Try here Editor page	
     
     @Tree_ImpBST @TreeTC_028
     Scenario: Validate the TreeModule_Page-Implementation Of BST link
     Given user is on the Tree module page  	
     When user clicked Implementation Of BST link in the TreeModule page
     Then user is able to view the  Implementation Of BST linked page
     
     @Imp_BST_Tryhere @TreeTC_029
     Scenario: Validate the Implementation Of BST-Try here
     Give user is on the Implementation Of BST
     When user clicked the Try here on the Implementation Of BST page
     Then user should get navigated to Try here Editor page							
     
     
     @Tree_Prac_Ques @TreeTC_030
     Scenario: Validate the TreeModule_Practice Questions
     Given user is on the Tree module page
     When user clicked the Practice Questions		
     Then user is get navigated to blank page							 																																																																																																																		