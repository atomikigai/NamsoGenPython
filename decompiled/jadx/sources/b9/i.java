package b9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.bumptech.glide.c {
    @Override // com.bumptech.glide.c
    public final void r(u uVar, float f10, float f11) {
        uVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        q qVar = new q(0.0f, 0.0f, f12, f12);
        qVar.f1506f = 180.0f;
        qVar.f1507g = 90.0f;
        uVar.f1517f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f1518g.add(oVar);
        uVar.f1516d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        uVar.f1514b = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        uVar.f1515c = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}
