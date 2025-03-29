def findAnagrams(s, p):
    dic = {}
    for i in p:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    j = 0
    temp = {}
    count =[]
    for i in range(len(s)):
        if s[i] in dic:
            if s[i] not in temp:
                temp[s[i]] = 1
            else:
                temp[s[i]] += 1
            if temp == dic:
                count.append(j)
                if temp[s[j]] == 1:
                    temp.pop(s[j])
                else:
                    temp[s[j]] -= 1
                j += 1
            elif temp[s[i]] > dic[s[i]]:
                while temp[s[i]] > dic[s[i]]:
                    if temp[s[j]] == 1:
                        temp.pop(s[j])
                    else:
                        temp[s[j]] -= 1
                    j = j + 1
        else:
            temp.clear()
            j = i + 1
    print(count)


s = "abaacbabc"
p = "cba"
findAnagrams(s,p)
