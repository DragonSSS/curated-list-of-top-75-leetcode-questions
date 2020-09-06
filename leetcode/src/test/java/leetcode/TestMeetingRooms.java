package leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMeetingRooms {

    @Test
    public void testCanAttendMeetings() {
        int[][] failed = new int[][]{{0,30}, {5,10}, {15,20}};
        int[][] success = new int[][]{{7,10}, {2,4}};

        assertEquals(false, new MeetingRooms().canAttendMeetings(failed));
        assertEquals(true, new MeetingRooms().canAttendMeetings(success));
    }
}
