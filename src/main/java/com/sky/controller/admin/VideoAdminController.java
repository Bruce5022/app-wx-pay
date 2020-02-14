package com.sky.controller.admin;


import com.sky.domain.Video;
import com.sky.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/video")
public class VideoAdminController {


    @Autowired
    private VideoService videoService;

    /**
     * 根据id删除视频
     * @param videoId
     * @return
     */
    @DeleteMapping("del_by_id")
    public Object delById(@RequestParam(value = "video_id",required = true)int videoId){

        return videoService.delete(videoId);
    }

    /**
     * 根据id更新视频
     * @return
     */
    @PutMapping("update_by_id")
    public Object update(@RequestBody Video video){


        return videoService.update(video);
    }


    /**
     * 保存视频对象
     * @param video
     * @return
     */
    @PostMapping("save")
    public Object save(@RequestBody Video video){
        return videoService.save(video);
    }

}
