package com.practice.mongoProject.practice;

class Test
{
    static void removeChar(String s, char c)
    {
        int j, count = 0, n = s.length();
        char []t = s.toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;
        }

        while(count > 0)
        {
            t[j++] = '\0';
            count--;
        }

        System.out.println(t);
    }

    // Driver Code
    public static void main(String[] args)
    {
        String s = "{\"videoUrl\":\"https://vimeo.com/344824495\",\"hlsVideoUrl\":\"https://player.vimeo.com/external/344824495.m3u8?s\\u003dca199796b686b3169e73e0f8f9bb33c73e8c6209\\u0026oauth2_token_id\\u003d1148079583\",\"title\":\"Meet our IIT-JEE Advanced 2019 Toppers\",\"description\":\"Journey of our IT-JEE Advanced 2019 Toppers\",\"teacherIds\":[],\"socialContextType\":\"CMDSVIDEO\",\"duration\":209,\"thumbnail\":\"https://i.vimeocdn.com/video/794417585_640x360.jpg?r\\u003dpad\",\"videoSourceType\":\"VIMEO\",\"videoViews\":2,\"totalLikes\":2,\"totalUnlikes\":0,\"targetGrades\":[\"CBSE-9\",\"CBSE-8\",\"CBSE-7\",\"CBSE-6\",\"CBSE-10\",\"CBSE-13\",\"CBSE-12\",\"CBSE-11\"],\"tSubjects\":[\"General\"],\"tTopics\":[\"Motivational\",\"General\"],\"inputTopics\":[\"Motivational\"],\"tGrades\":[\"11\",\"12\",\"13\",\"6\",\"7\",\"8\",\"9\",\"10\"],\"tTargets\":[\"CBSE\"],\"mainTags\":[\"CBSE-9\",\"11\",\"CBSE-8\",\"12\",\"13\",\"CBSE-7\",\"Motivational\",\"CBSE-6\",\"CBSE-10\",\"CBSE-13\",\"CBSE\",\"CBSE-12\",\"CBSE-11\",\"6\",\"7\",\"8\",\"General\",\"9\",\"10\"],\"id\":\"5d14e2858f08fbb608d5849c\",\"creationTime\":1561649797112,\"createdBy\":\"4102379831498257\",\"lastUpdated\":1561650768036,\"lastUpdatedBy\":\"SYSTEM\",\"entityState\":\"ACTIVE\"}";
        removeChar(s, '\\');
    }
}
