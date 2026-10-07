package c4;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import d4.m;
import d4.o;
import d4.u;
import u3.h;
import u3.i;
import u3.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f1767a = u.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.a f1770d;
    public final m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f1772g;

    public b(int i, int i10, i iVar) {
        this.f1768b = i;
        this.f1769c = i10;
        this.f1770d = (u3.a) iVar.c(o.f2888f);
        this.e = (m) iVar.c(m.f2886g);
        h hVar = o.i;
        this.f1771f = iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue();
        this.f1772g = (j) iVar.c(o.f2889g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f1767a.c(this.f1768b, this.f1769c, this.f1771f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f1770d == u3.a.f8843b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f1768b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f1769c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        j jVar = this.f1772g;
        if (jVar != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((jVar == j.f8853a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
