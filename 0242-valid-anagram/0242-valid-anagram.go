func isAnagram(s string, t string) bool {
    if(len(s) != len(t)){
        return false
    }
    var a[26]int
    for i:=0; i<len(s); i++{
        a[s[i]-'a']++
        a[t[i]-'a']--
    }
    for i:=0; i<26; i++{
        if a[i] != 0 {
            return false
        }
    }
    return true
}