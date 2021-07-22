package school.solution.dbservices.service;

import school.solution.dbservices.dto.NoticeDto;
import school.solution.dbservices.model.Notice;

import java.util.List;

public interface NoticeService {
	Notice save(NoticeDto noticeDto);
	List<Notice> allNotice();
}
