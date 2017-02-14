@ex_tag												
Feature: Comments								
#comment in description							

@ex_tag											
  Scenario: minimalistic						
  #comment in scenario description			
  Given a simple data table						
  #comment beetwin steplines 					
    Given a simple data table					
      | foo | bar |									
	  #comment in datatable					
      | boz | boo |							
    And a data table with a single cell		
      """											
	  doccoment									
	  #comment in doccoment							
	  """										
    And a data table with different fromatting			
   
   @ex_tag2										
     Scenario Outline: the outline				
	 #comment in scenario outline description	
    Given the <two>								
	 #comment beetwin steplines					
    Given the <four>							

    Examples:										
      | one | two  |								
      | un  | deux |							
	  #comment in example table					
      | uno | dos  |	
