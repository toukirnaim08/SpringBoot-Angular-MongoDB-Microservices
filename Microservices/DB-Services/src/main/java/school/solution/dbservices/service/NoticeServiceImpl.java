package school.solution.dbservices.service;

import org.springframework.stereotype.Service;
import school.solution.dbservices.dto.NoticeDto;
import school.solution.dbservices.model.Notice;
import school.solution.dbservices.repository.NoticeRepository;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{

	private NoticeRepository noticeRepository;
	int counter;

	public NoticeServiceImpl(NoticeRepository noticeRepository) {
		this.noticeRepository = noticeRepository;
	}

	@Override
	public Notice save(NoticeDto noticeDto) {
		counter++;
		Notice notice = new Notice(counter,noticeDto.getCreateDate(),noticeDto.getEventDate(),
				noticeDto.getTitle(),noticeDto.getDescription());
		return this.noticeRepository.save(notice);
	}

	@Override
	public List<Notice> allNotice() {
		return this.noticeRepository.findAll();
	}
}
