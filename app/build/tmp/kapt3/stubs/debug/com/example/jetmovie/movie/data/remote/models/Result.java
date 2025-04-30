package com.example.jetmovie.movie.data.remote.models;

@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002[\\B\u00c9\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0001\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018B\u00b5\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010C\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0013\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tH\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u00be\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u00052\b\u0010P\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00d6\u0001J\t\u0010R\u001a\u00020\u0007H\u00d6\u0001J&\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u00c1\u0001\u00a2\u0006\u0002\bZR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R&\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010$R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010(\u0012\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010!R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010!R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010!R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u00102\u0012\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010!R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001b\u001a\u0004\b6\u0010!R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001b\u001a\u0004\b8\u0010!R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010\u001dR \u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u00102\u0012\u0004\b;\u0010\u001b\u001a\u0004\b<\u00101R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010(\u0012\u0004\b=\u0010\u001b\u001a\u0004\b>\u0010\'\u00a8\u0006]"}, d2 = {"Lcom/example/jetmovie/movie/data/remote/models/Result;", "", "seen1", "", "adult", "", "backdropPath", "", "genreIds", "", "id", "originalLanguage", "originalTitle", "overview", "popularity", "", "posterPath", "releaseDate", "title", "video", "voteAverage", "voteCount", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;)V", "getAdult$annotations", "()V", "getAdult", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackdropPath$annotations", "getBackdropPath", "()Ljava/lang/String;", "getGenreIds$annotations", "getGenreIds", "()Ljava/util/List;", "getId$annotations", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginalLanguage$annotations", "getOriginalLanguage", "getOriginalTitle$annotations", "getOriginalTitle", "getOverview$annotations", "getOverview", "getPopularity$annotations", "getPopularity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPosterPath$annotations", "getPosterPath", "getReleaseDate$annotations", "getReleaseDate", "getTitle$annotations", "getTitle", "getVideo$annotations", "getVideo", "getVoteAverage$annotations", "getVoteAverage", "getVoteCount$annotations", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/example/jetmovie/movie/data/remote/models/Result;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_debug", "$serializer", "Companion", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean adult = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String backdropPath = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Integer> genreIds = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalLanguage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String originalTitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double popularity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String posterPath = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String releaseDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean video = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double voteAverage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer voteCount = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.jetmovie.movie.data.remote.models.Result.Companion Companion = null;
    
    public Result(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> genreIds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAdult() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "adult")
    @java.lang.Deprecated()
    public static void getAdult$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "backdrop_path")
    @java.lang.Deprecated()
    public static void getBackdropPath$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getGenreIds() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "genre_ids")
    @java.lang.Deprecated()
    public static void getGenreIds$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "id")
    @java.lang.Deprecated()
    public static void getId$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "original_language")
    @java.lang.Deprecated()
    public static void getOriginalLanguage$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "original_title")
    @java.lang.Deprecated()
    public static void getOriginalTitle$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "overview")
    @java.lang.Deprecated()
    public static void getOverview$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "popularity")
    @java.lang.Deprecated()
    public static void getPopularity$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "poster_path")
    @java.lang.Deprecated()
    public static void getPosterPath$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "release_date")
    @java.lang.Deprecated()
    public static void getReleaseDate$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "title")
    @java.lang.Deprecated()
    public static void getTitle$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "video")
    @java.lang.Deprecated()
    public static void getVideo$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "vote_average")
    @java.lang.Deprecated()
    public static void getVoteAverage$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "vote_count")
    @java.lang.Deprecated()
    public static void getVoteCount$annotations() {
    }
    
    public Result() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.jetmovie.movie.data.remote.models.Result copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> genreIds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String originalLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String originalTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.Double popularity, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video, @org.jetbrains.annotations.Nullable()
    java.lang.Double voteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer voteCount) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.jetmovie.movie.data.remote.models.Result self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/example/jetmovie/movie/data/remote/models/Result.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/jetmovie/movie/data/remote/models/Result;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.example.jetmovie.movie.data.remote.models.Result> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.jetmovie.movie.data.remote.models.Result.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.example.jetmovie.movie.data.remote.models.Result deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.example.jetmovie.movie.data.remote.models.Result value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/example/jetmovie/movie/data/remote/models/Result$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/jetmovie/movie/data/remote/models/Result;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.example.jetmovie.movie.data.remote.models.Result> serializer() {
            return null;
        }
    }
}