package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f5506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5507b;

    public q() {
    }

    public q(byte b10, Object obj) {
        this.f5506a = b10;
        this.f5507b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f5506a;
        Object obj = this.f5507b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f5357a);
                objectOutput.writeInt(duration.f5358b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f5359a);
                objectOutput.writeInt(instant.f5360b);
                return;
            case 3:
                f fVar = (f) obj;
                objectOutput.writeInt(fVar.f5434a);
                objectOutput.writeByte(fVar.f5435b);
                objectOutput.writeByte(fVar.f5436c);
                return;
            case 4:
                ((i) obj).W(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                f fVar2 = localDateTime.f5363a;
                objectOutput.writeInt(fVar2.f5434a);
                objectOutput.writeByte(fVar2.f5435b);
                objectOutput.writeByte(fVar2.f5436c);
                localDateTime.f5364b.W(objectOutput);
                return;
            case 6:
                y yVar = (y) obj;
                LocalDateTime localDateTime2 = yVar.f5551a;
                f fVar3 = localDateTime2.f5363a;
                objectOutput.writeInt(fVar3.f5434a);
                objectOutput.writeByte(fVar3.f5435b);
                objectOutput.writeByte(fVar3.f5436c);
                localDateTime2.f5364b.W(objectOutput);
                yVar.f5552b.Q(objectOutput);
                yVar.f5553c.I(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).f5548a);
                return;
            case 8:
                ((ZoneOffset) obj).Q(objectOutput);
                return;
            case 9:
                o oVar = (o) obj;
                oVar.f5500a.W(objectOutput);
                oVar.f5501b.Q(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f5366a;
                f fVar4 = localDateTime3.f5363a;
                objectOutput.writeInt(fVar4.f5434a);
                objectOutput.writeByte(fVar4.f5435b);
                objectOutput.writeByte(fVar4.f5436c);
                localDateTime3.f5364b.W(objectOutput);
                offsetDateTime.f5367b.Q(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((s) obj).f5511a);
                return;
            case 12:
                u uVar = (u) obj;
                objectOutput.writeInt(uVar.f5545a);
                objectOutput.writeByte(uVar.f5546b);
                return;
            case 13:
                m mVar = (m) obj;
                objectOutput.writeByte(mVar.f5496a);
                objectOutput.writeByte(mVar.f5497b);
                return;
            case 14:
                p pVar = (p) obj;
                objectOutput.writeInt(pVar.f5503a);
                objectOutput.writeInt(pVar.f5504b);
                objectOutput.writeInt(pVar.f5505c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b10 = objectInput.readByte();
        this.f5506a = b10;
        this.f5507b = a(b10, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                Duration duration = Duration.f5356c;
                long j4 = objectInput.readLong();
                long j10 = objectInput.readInt();
                return Duration.u(Math.addExact(j4, Math.floorDiv(j10, 1000000000L)), (int) Math.floorMod(j10, 1000000000L));
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.w(objectInput.readLong(), objectInput.readInt());
            case 3:
                f fVar = f.f5433d;
                return f.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return i.R(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f5361c;
                f fVar2 = f.f5433d;
                return LocalDateTime.I(f.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.R(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f5361c;
                f fVar3 = f.f5433d;
                LocalDateTime localDateTimeI = LocalDateTime.I(f.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.R(objectInput));
                ZoneOffset zoneOffsetP = ZoneOffset.P(objectInput);
                v vVar = (v) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(vVar, "zone");
                if (!(vVar instanceof ZoneOffset) || zoneOffsetP.equals(vVar)) {
                    return new y(localDateTimeI, vVar, zoneOffsetP);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = w.f5547c;
                String utf = objectInput.readUTF();
                Objects.requireNonNull(utf, "zoneId");
                if (utf.length() <= 1 || utf.startsWith("+") || utf.startsWith("-")) {
                    return ZoneOffset.K(utf);
                }
                if (utf.startsWith("UTC") || utf.startsWith("GMT")) {
                    return v.C(utf, 3);
                }
                return utf.startsWith("UT") ? v.C(utf, 2) : w.K(utf);
            case 8:
                return ZoneOffset.P(objectInput);
            case 9:
                int i10 = o.f5499c;
                return new o(i.R(objectInput), ZoneOffset.P(objectInput));
            case 10:
                int i11 = OffsetDateTime.f5365c;
                f fVar4 = f.f5433d;
                return new OffsetDateTime(LocalDateTime.I(f.P(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.R(objectInput)), ZoneOffset.P(objectInput));
            case 11:
                int i12 = s.f5510b;
                return s.u(objectInput.readInt());
            case 12:
                int i13 = u.f5544c;
                int i14 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                j$.time.temporal.a.YEAR.M(i14);
                j$.time.temporal.a.MONTH_OF_YEAR.M(b11);
                return new u(i14, b11);
            case 13:
                int i15 = m.f5495c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                k kVarI = k.I(b12);
                Objects.requireNonNull(kVarI, "month");
                j$.time.temporal.a.DAY_OF_MONTH.M(b13);
                if (b13 <= kVarI.C()) {
                    return new m(kVarI.getValue(), b13);
                }
                throw new a("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + kVarI.name());
            case 14:
                p pVar = p.f5502d;
                int i16 = objectInput.readInt();
                int i17 = objectInput.readInt();
                int i18 = objectInput.readInt();
                return ((i16 | i17) | i18) == 0 ? p.f5502d : new p(i16, i17, i18);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f5507b;
    }
}
