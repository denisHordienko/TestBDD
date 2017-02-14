@ST_10 @ex_tag
Feature: Comments
#comment in description							


@SC_44 @ex_tag
Scenario: minimalistic
#comment in scenario description
Given a simple data table
#comment beetwin steplines
Given a simple data table
|foo|bar|
#comment
|boz|boo|
#comment in datatable
#comment in datatable
And a data table with a single cell
"""
doccoment
#comment in doccoment
"""
And a data table with different fromatting

@SC_45 @ex_tag2
Scenario Outline: the outline
#comment in scenario outline description
Given the <two>
#comment beetwin steplines
Given the <four>
#comment in example table

Examples: 
|one|two|
|un|deux|
|uno|dos|