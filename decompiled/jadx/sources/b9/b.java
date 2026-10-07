package b9;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1437b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1436a;
            f10 += ((b) cVar).f1437b;
        }
        this.f1436a = cVar;
        this.f1437b = f10;
    }

    @Override // b9.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1436a.a(rectF) + this.f1437b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1436a.equals(bVar.f1436a) && this.f1437b == bVar.f1437b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1436a, Float.valueOf(this.f1437b)});
    }
}
