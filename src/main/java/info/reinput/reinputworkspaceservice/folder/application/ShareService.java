package info.reinput.reinputworkspaceservice.folder.application;

import info.reinput.reinputworkspaceservice.folder.application.dto.ShareDto;
import info.reinput.reinputworkspaceservice.folder.presentation.dto.req.ShareCreateReq;

public interface ShareService {
    ShareDto createShare(final ShareCreateReq shareCreateReq, final Long memberId);
}
