Feature: Mystore Women category test
@login
Scenario Outline: Mystore login Test 
Then user click on sigin button
Then enter "<email>" and "<password>"

Examples:
| email                   | password  |
| hiwsenikita04@gmail.com | Shrinik2@ |

@cateoryTest
Scenario: Women category test
When user is on home page 
Then Check categories under women section