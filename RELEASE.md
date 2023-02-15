# *Product Model - Applicability of AutomaticExercise*

_Background_

Previously it was not possible to specify that a swaption can be exercised automatically irrespective of any threshold. This release addresses this issue.

_What is being released?_

In data type `AutomaticExercise`:

- Attribute `isApplicable` of data type `AutomaticExercise` has been added.
- The cardinality of `thresholdRate` has been relaxed to optional

The FpML synonym mappings for `AutomaticExercise` have been updated.

_Review Directions_

In the CDM Portal, select the Textual Browser to inspect the types mentioned above and review the changes.
In the CDM Portal, select Ingestion and review the following samples:

* `fpml-5-10 > incomplete-products > equity-options` 
* `fpml-5-10 > incomplete-products > commodity-derivatives` 
