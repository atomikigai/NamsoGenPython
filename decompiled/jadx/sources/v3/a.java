package v3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f9159c = {"_data"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f9160d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f9162b;

    public /* synthetic */ a(ContentResolver contentResolver, int i) {
        this.f9161a = i;
        this.f9162b = contentResolver;
    }

    @Override // v3.b
    public final Cursor a(Uri uri) {
        switch (this.f9161a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f9162b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f9159c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f9162b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f9160d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
