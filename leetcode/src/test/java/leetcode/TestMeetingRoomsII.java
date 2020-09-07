package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMeetingRoomsII {

    @Test
    public void testMinMeetingRooms() {

        int[][] data1 = new int[][]{{0,30}, {5,10}, {15, 20}};
        int[][] data2 = new int[][]{{7,10}, {2,4}};

        assertEquals(2, new MeetingRoomsII().minMeetingRooms(data1));
        assertEquals(1, new MeetingRoomsII().minMeetingRooms(data2));
    }
}
