package com.synisys.cms;

import com.synisys.cms.dto.ResourceDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Author Yerem.Gevorgyan 3/17/2017.
 */
@RestController
public class Controller {
    @CrossOrigin("*")
    @RequestMapping(method = RequestMethod.GET, value = "/playlist")
    public List<ResourceDto> getPlaylist() {
        List<ResourceDto> resourceDtos = new ArrayList<>();
        resourceDtos.add(new ResourceDto(1, "video", "Heylo Heylo", "Video Clip By Beyonce", "http://192.168.38.206:8090/streamwebm2"));
        resourceDtos.add(new ResourceDto(2,"video", "Karma Police", "Video Clip By Radiohead", "http://192.168.38.206:8090/streamwebm3"));
        resourceDtos.add(new ResourceDto(3, "html", "Synergy Page", "News BBC", "https://www.synisys.com/products/public-investment-management-suite"));
        return resourceDtos;
    }

}
