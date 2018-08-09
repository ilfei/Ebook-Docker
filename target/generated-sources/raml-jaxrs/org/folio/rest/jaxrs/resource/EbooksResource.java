
package org.folio.rest.jaxrs.resource;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import io.vertx.core.Context;
import org.folio.rest.annotations.Validate;
import org.folio.rest.jaxrs.model.Book;

@Path("ebooks")
public interface EbooksResource {


    /**
     * 
     * @param author
     *     An author's full name e.g. Mary Roach
     * @param isbn
     *      e.g. 03217360797
     * @param rating
     *     Average rating (1-5) submitted by users e.g. 3.14
     * @param vertxContext
     *      The Vertx Context Object <code>io.vertx.core.Context</code> 
     * @param publicationYear
     *     The year released for the first time in the US e.g. 1984
     * @param asyncResultHandler
     *     A <code>Handler<AsyncResult<Response>>></code> handler {@link io.vertx.core.Handler} which must be called as follows - Note the 'GetPatronsResponse' should be replaced with '[nameOfYourFunction]Response': (example only) <code>asyncResultHandler.handle(io.vertx.core.Future.succeededFuture(GetPatronsResponse.withJsonOK( new ObjectMapper().readValue(reply.result().body().toString(), Patron.class))));</code> in the final callback (most internal callback) of the function.
     * @param bookTitle
     *     
     */
    @GET
    @Path("{bookTitle}")
    @Produces({
        "application/json"
    })
    @Validate
    void getEbooksByBookTitle(
        @PathParam("bookTitle")
        @NotNull
        String bookTitle,
        @QueryParam("author")
        String author,
        @QueryParam("publicationYear")
        BigDecimal publicationYear,
        @QueryParam("rating")
        BigDecimal rating,
        @QueryParam("isbn")
        @Size(min = 10)
        String isbn, java.util.Map<String, String>okapiHeaders, io.vertx.core.Handler<io.vertx.core.AsyncResult<Response>>asyncResultHandler, Context vertxContext)
        throws Exception
    ;

    /**
     * 
     * @param vertxContext
     *      The Vertx Context Object <code>io.vertx.core.Context</code> 
     * @param asyncResultHandler
     *     A <code>Handler<AsyncResult<Response>>></code> handler {@link io.vertx.core.Handler} which must be called as follows - Note the 'GetPatronsResponse' should be replaced with '[nameOfYourFunction]Response': (example only) <code>asyncResultHandler.handle(io.vertx.core.Future.succeededFuture(GetPatronsResponse.withJsonOK( new ObjectMapper().readValue(reply.result().body().toString(), Patron.class))));</code> in the final callback (most internal callback) of the function.
     * @param accessToken
     *     Token giving you permission to make call
     * @param bookTitle
     *     
     */
    @PUT
    @Path("{bookTitle}")
    @Validate
    void putEbooksByBookTitle(
        @PathParam("bookTitle")
        @NotNull
        String bookTitle,
        @QueryParam("access_token")
        @NotNull
        String accessToken, java.util.Map<String, String>okapiHeaders, io.vertx.core.Handler<io.vertx.core.AsyncResult<Response>>asyncResultHandler, Context vertxContext)
        throws Exception
    ;

    public class GetEbooksByBookTitleResponse
        extends org.folio.rest.jaxrs.resource.support.ResponseWrapper
    {


        private GetEbooksByBookTitleResponse(Response delegate) {
            super(delegate);
        }

        /**
         *  e.g. {
         *   "bookdata": {
         *     "id": "SbBGk",
         *     "title": "Stiff: The Curious Lives of Human Cadavers",
         *     "description": null,
         *     "datetime": 1341533193,
         *     "genre": "science",
         *     "author": "Mary Roach",
         *     "link": "http://e-bookmobile.com/books/Stiff"
         *   },
         *   "success": true,
         *   "status": 200
         * }
         * 
         * 
         * @param entity
         *     {
         *       "bookdata": {
         *         "id": "SbBGk",
         *         "title": "Stiff: The Curious Lives of Human Cadavers",
         *         "description": null,
         *         "datetime": 1341533193,
         *         "genre": "science",
         *         "author": "Mary Roach",
         *         "link": "http://e-bookmobile.com/books/Stiff"
         *       },
         *       "success": true,
         *       "status": 200
         *     }
         *     
         */
        public static EbooksResource.GetEbooksByBookTitleResponse withJsonOK(Book entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new EbooksResource.GetEbooksByBookTitleResponse(responseBuilder.build());
        }

    }

    public class PutEbooksByBookTitleResponse
        extends org.folio.rest.jaxrs.resource.support.ResponseWrapper
    {


        private PutEbooksByBookTitleResponse(Response delegate) {
            super(delegate);
        }

    }

}
