## Speed Converter

### Description

1. Write a method called <b>toMilesPerHour</b> that has 1 parameter of type <b>double</b> with the name <b>kilometersPerHour</b>. This method needs to return the rounded value of the calculation of type <b>long</b>.<br><br>If the parameter b>kilometersPerHour</b> is less than 0, the method <b>toMilesPerHour</b> needs to return -1 to indicate an invalid value. Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.<br><br>Use method <b>Math.round</b> to round the number of calculated miles per hour(double). The method round returns long.<br><br><b>NOTE</b>: 1 mile per hour is 1.609 kilometers per hour

### Examples of input/output

<ul>
<li>toMilesPerHour(1.5); → should return value 1</li>
<li>toMilesPerHour(10.25); → should return value 6</li>
<li>toMilesPerHour(-5.6); → should return value -1</li>
<li>toMilesPerHour(25.42); → should return value 16</li>
<li>toMilesPerHour(75.114); → should return value 47</li>
</ul>

2. Write another method called <b>printConversion</b> with 1 parameter of type <b>double</b> with the name <b>kilometersPerHour</b>. This method should not return anything (void) and it needs to calculate <b>milesPerHour</b> from the <b>kilometersPerHour</b> parameter. Then it needs to print a message in the format "XX km/h = YY mi/h".<br><br>XX represents the original value kilometersPerHour.<br> YY represents the rounded milesPerHour from the kilometersPerHour parameter.<br><br>If the parameter <b>kilometersPerHour</b> is < 0 then print the text "Invalid Value".

### Examples of input/output

<ul>
<li>printConversion(1.5); → 1.5 km/h = 1 mi/h</li>
<li>printConversion(10.25); → 10.25 km/h = 6 mi/h</li>
<li>printConversion(-5.6); → Invalid Value</li>
<li>printConversion(25.42); → 25.42 km/h = 16 mi/h</li>
<li>printConversion(75.114); → 75.114 km/h = 47 mi/h</li>
</ul>
