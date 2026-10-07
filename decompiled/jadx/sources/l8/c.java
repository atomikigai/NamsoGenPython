package l8;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f6873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.f6872b = i;
        switch (i) {
            case 1:
                this.f6873c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.f6873c = carouselLayoutManager;
                break;
        }
    }

    @Override // h2.c
    public final int b() {
        switch (this.f6872b) {
            case 0:
                return this.f6873c.f10093o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f6873c;
                return carouselLayoutManager.f10093o - carouselLayoutManager.B();
        }
    }

    @Override // h2.c
    public final int c() {
        switch (this.f6872b) {
            case 0:
                return this.f6873c.C();
            default:
                return 0;
        }
    }

    @Override // h2.c
    public final int d() {
        switch (this.f6872b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f6873c;
                return carouselLayoutManager.f10092n - carouselLayoutManager.D();
            default:
                return this.f6873c.f10092n;
        }
    }

    @Override // h2.c
    public final int e() {
        switch (this.f6872b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f6873c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f10092n;
                }
                return 0;
        }
    }

    @Override // h2.c
    public final int f() {
        switch (this.f6872b) {
            case 0:
                return 0;
            default:
                return this.f6873c.E();
        }
    }
}
