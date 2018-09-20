package osquitoofthenorth.com.sb_github_app.sb_github_app.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B3\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\nH\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\b\u0010\u001a\u001a\u00020\nH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\u0006\u0010\u001f\u001a\u00020\u0006J\t\u0010 \u001a\u00020\nH\u00d6\u0001J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\u001a\u0010\"\u001a\u00020#2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\nH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010\u00a8\u0006&"}, d2 = {"Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/RepoInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "name", "", "description", "lastUpdated", "stars", "", "forks", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getDescription", "()Ljava/lang/String;", "getForks", "()I", "getLastUpdated", "getName", "getStars", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "formattedLastUpdated", "hashCode", "toString", "writeToParcel", "", "p1", "CREATOR", "app_release"})
public final class RepoInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String lastUpdated = null;
    @com.google.gson.annotations.SerializedName(value = "stargazers_count")
    private final int stars = 0;
    @com.google.gson.annotations.SerializedName(value = "forks")
    private final int forks = 0;
    public static final osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formattedLastUpdated() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.Nullable()
    android.os.Parcel parcel, int p1) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final int getStars() {
        return 0;
    }
    
    public final int getForks() {
        return 0;
    }
    
    public RepoInfo(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String lastUpdated, int stars, int forks) {
        super();
    }
    
    public RepoInfo(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo copy(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String lastUpdated, int stars, int forks) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/RepoInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/RepoInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Losquitoofthenorth/com/sb_github_app/sb_github_app/Models/RepoInfo;", "app_release"})
    public static final class CREATOR implements android.os.Parcelable.Creator<osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public osquitoofthenorth.com.sb_github_app.sb_github_app.Models.RepoInfo[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}