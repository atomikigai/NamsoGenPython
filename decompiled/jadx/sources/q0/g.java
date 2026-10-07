package q0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7897a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f7898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7900d;
    public Uri e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f7901f;

    public /* synthetic */ g() {
    }

    @Override // q0.h
    public ClipData a() {
        return this.f7898b;
    }

    @Override // q0.f
    public void b(Uri uri) {
        this.e = uri;
    }

    @Override // q0.f
    public i build() {
        return new i(new g(this));
    }

    @Override // q0.f
    public void c(int i) {
        this.f7900d = i;
    }

    @Override // q0.h
    public int d() {
        return this.f7900d;
    }

    @Override // q0.h
    public ContentInfo e() {
        return null;
    }

    @Override // q0.h
    public int f() {
        return this.f7899c;
    }

    @Override // q0.f
    public void setExtras(Bundle bundle) {
        this.f7901f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f7897a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f7898b.getDescription());
                sb2.append(", source=");
                int i = this.f7899c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i10 = this.f7900d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return q1.a.m(sb2, this.f7901f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public g(g gVar) {
        ClipData clipData = gVar.f7898b;
        clipData.getClass();
        this.f7898b = clipData;
        int i = gVar.f7899c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f7899c = i;
        int i10 = gVar.f7900d;
        if ((i10 & 1) == i10) {
            this.f7900d = i10;
            this.e = gVar.e;
            this.f7901f = gVar.f7901f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
