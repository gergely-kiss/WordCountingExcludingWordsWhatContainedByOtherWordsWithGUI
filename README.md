# WordCountingExcludingWordsWhatContainedByOtherWordsWithGUI
A customer wishes to create a word count program. However, unlike a traditional word count
they wish to ignore words which are partial matches of longer words. For example, using the
following text:
A mate material may maybe right maybe
A is discarded as it is contained in mate, material, may, and maybe.
A mate material may maybe right maybe
Mate is discarded as it is contained in material.
A mate material may maybe right maybe
May is discarded as it is contained in maybe.
A mate material may maybe right maybe
Write a Java program which takes an input file and outputs the word count, for example
based on the previous example text the output would be:
Material: 1
Maybe: 2
Right: 1
The output should be sorted by longest word in descending order.
