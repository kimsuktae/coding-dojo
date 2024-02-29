class Solution {

    //"" -> ""
    //"ddd" -> "ddd"
    //"cat", "corn" -> "c"
    fun longestCommonPrefix(strings: Array<String>): String {
        var prefix = ""

        for (i: Int in strings.indices) {
            if (i == 0) {
                prefix = strings[i]

                continue
            }

            for (j: Int in prefix.indices) {
                if (j >= strings[i].length ) {
                    prefix = prefix.slice(0..< j)

                    break
                }

                if (prefix[j] != strings[i][j]) {
                    prefix = prefix.slice(0..< j)

                    break
                }
            }
        }

        return prefix
    }
}
