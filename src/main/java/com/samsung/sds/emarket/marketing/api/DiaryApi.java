/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.samsung.sds.emarket.marketing.api;

import com.samsung.sds.emarket.marketing.api.model.DiaryDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "Diary", description = "the Diary API")
public interface DiaryApi {

    /**
     * DELETE /api/v1/diarys/{id} : Deletes a diary
     * delete a diary
     *
     * @param id Diary ID (required)
     * @return OK (status code 200)
     *         or Invalid diary ID value (status code 400)
     */
    @ApiOperation(value = "Deletes a diary", nickname = "deleteDiary", notes = "delete a diary", response = Integer.class, tags={ "Diary", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Integer.class),
        @ApiResponse(code = 400, message = "Invalid diary ID value") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/diarys/{id}",
        produces = { "application/json" }
    )
    ResponseEntity<Integer> deleteDiary(@ApiParam(value = "Diary ID", required = true) @PathVariable("id") Integer id);


    /**
     * GET /api/v1/diarys
     *
     * @return Success (status code 200)
     */
    @ApiOperation(value = "", nickname = "getDiaryList", notes = "", response = DiaryDTO.class, responseContainer = "List", tags={ "Diary", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DiaryDTO.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/diarys",
        produces = { "application/json" }
    )
    ResponseEntity<List<DiaryDTO>> getDiaryList();


    /**
     * POST /api/v1/diarys
     * Create new diary
     *
     * @param diaryDTO  (optional)
     * @return Create OK (status code 201)
     */
    @ApiOperation(value = "", nickname = "postDiary", notes = "Create new diary", response = DiaryDTO.class, tags={ "Diary", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Create OK", response = DiaryDTO.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/diarys",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<DiaryDTO> postDiary(@ApiParam(value = "") @Valid @RequestBody(required = false) DiaryDTO diaryDTO);


    /**
     * PUT /api/v1/diarys/{id}
     * Update a diary with the specified id
     *
     * @param id Diary ID (required)
     * @param diaryDTO  (optional)
     * @return OK (status code 200)
     *         or No campaign with the specified id (status code 404)
     */
    @ApiOperation(value = "", nickname = "putDiary", notes = "Update a diary with the specified id", response = DiaryDTO.class, tags={ "Diary", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DiaryDTO.class),
        @ApiResponse(code = 404, message = "No campaign with the specified id") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/diarys/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<DiaryDTO> putDiary(@ApiParam(value = "Diary ID", required = true) @PathVariable("id") Integer id,@ApiParam(value = "") @Valid @RequestBody(required = false) DiaryDTO diaryDTO);

}